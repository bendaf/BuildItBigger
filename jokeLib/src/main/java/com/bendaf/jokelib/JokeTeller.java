package com.bendaf.jokelib;

public class JokeTeller {
    public static class Joke {
        String begin;
        String end;

        Joke(String begin, String end) {
            this.begin = begin;
            this.end = end;
        }

        public String getInstruction() {
            return begin;
        }

        public void setBegin(String begin) {
            this.begin = begin;
        }

        public String getEnd() {
            return end;
        }

        public void setEnd(String end) {
            this.end = end;
        }
    }

    public static Joke tellJoke() {
        return new Joke("Which is the best joke ever?", "This.");
    }
}
