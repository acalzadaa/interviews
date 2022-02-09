package com.alex.awesome;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.time.temporal.ChronoUnit.MINUTES;

public class FindTheBestSchedulePlanner
{
    /*
    a company wants to reduce costs
    keeping the office illumination on
    only in continuous intervals during the day

    for a given day of 24 hours,
    given a LIST of employees time schedules
    each with a PAIR of start and end times (8:00 to 12:30)
    return a pair of start and end times
    for every CONTINUOUS intervals during which at least
    one employee is present in the office.

    for example:
    employee 1 , starts at 8:00, ends at 10:00)
    employee 2 , starts at 10:30, ends at 13:30)
    employee 1 , starts at 15:00, ends at 16:15)
    employee 3 , starts at 15:45, ends at 20:00)

    returns:
    start 8:00, end 10:00
    start 10:30, end 13:30
    start 15:00, end 20:00

    note:
    if the list is EMPTY or NULL return and EMPTY LIST
    */

    public static void main(String[] args)
    {
        List<Schedule> unoptimizedSchedules = List.of(
                Schedule.builder().start(LocalTime.of(10, 30)).end(LocalTime.of(13, 30)).build(),
                Schedule.builder().start(LocalTime.of(15, 0)).end(LocalTime.of(16, 15)).build(),
                Schedule.builder().start(LocalTime.of(8, 0)).end(LocalTime.of(10, 0)).build(),
                Schedule.builder().start(LocalTime.of(15, 45)).end(LocalTime.of(20, 0)).build()
        );

        final var optimizedSchedules = optimizeSchedules(unoptimizedSchedules);

        optimizedSchedules.forEach(System.out::println);

    }

    private static List<Schedule> optimizeSchedules(List<Schedule> inmutableUnoptimizedSchedules)
    {

        if (inmutableUnoptimizedSchedules == null || inmutableUnoptimizedSchedules.isEmpty())
        {
            return List.of();
        }

        if (inmutableUnoptimizedSchedules.size() == 1)
        {
            return inmutableUnoptimizedSchedules;
        }

        List<Schedule> mutableUnoptimizedSchedulescheduled = new ArrayList<>(inmutableUnoptimizedSchedules);
        mutableUnoptimizedSchedulescheduled.sort(new ScheduleComparator());

        //initial values
        LocalTime start = LocalTime.MAX;
        LocalTime end = LocalTime.MIN;
        long minuteLength = 0;

        //return list
        List<Schedule> optimizedSchedules = new ArrayList<>();

        for (int x = 0; x < mutableUnoptimizedSchedulescheduled.size(); x++)
        {
            final var unoptimizedSchedule = mutableUnoptimizedSchedulescheduled.get(x);

            //is a new range?
            final var isNewRange = isNewRange(unoptimizedSchedule, end);

            if (isNewRange.equals(Boolean.TRUE))
            {
                if (minuteLength != 0)
                {
                    optimizedSchedules.add(Schedule.builder().start(start).end(end).build());
                }

                start = unoptimizedSchedule.start;
                end = unoptimizedSchedule.end;
                minuteLength = MINUTES.between(start, end);
                continue;
            }

            if (MINUTES.between(start, unoptimizedSchedule.end) > minuteLength)
            {
                end = unoptimizedSchedule.end;
                minuteLength = MINUTES.between(start, unoptimizedSchedule.end);
            }

            if (x == mutableUnoptimizedSchedulescheduled.size() - 1)
            {
                optimizedSchedules.add(Schedule.builder().start(start).end(end).build());
            }
        }

        return optimizedSchedules;
    }

    private static Boolean isNewRange(Schedule unoptimizedSchedule, LocalTime end)
    {
        return unoptimizedSchedule.start.isAfter(end);
    }

    private static class Schedule
    {
        private final LocalTime start;
        private final LocalTime end;

        private Schedule(Builder builder)
        {
            start = builder.start;
            end = builder.end;
        }

        public static Builder builder()
        {
            return new Builder();
        }

        @Override
        public String toString()
        {
            return "Schedule{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }

        public static class Builder
        {
            private LocalTime start;
            private LocalTime end;

            private Builder()
            {
            }

            public Builder start(LocalTime start)
            {
                this.start = start;
                return this;
            }

            public Builder end(LocalTime end)
            {
                this.end = end;
                return this;
            }

            public Schedule build()
            {
                return new Schedule(this);
            }
        }
    }

    private static class ScheduleComparator implements Comparator<Schedule>
    {
        @Override
        public int compare(Schedule o1, Schedule o2)
        {
            return o1.start.compareTo(o2.start);
        }
    }

}
