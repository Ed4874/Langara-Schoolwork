public interface Media {
    int totalTime();

    public abstract class Book implements Media {
        public static final int WORDS_PER_MINUTE = 300;
        public abstract int numPages();
        public int wordsPerPage() {
            return 300;
        }

        public int totalTime() {
            return numPages() * wordsPerPage() / WORDS_PER_MINUTE;
        }

        @Override
        public String toString() {
            return numPages() + " page book";
        }

        public static class Novel extends Book {
            private int pages;

            public Novel(int pages) {
                this.pages = pages;
            }

            @Override
            public int numPages() {
                return this.pages;
            }
        }

        public static class GraphicNovel extends Novel {
            public GraphicNovel() {
                super(100);
            }

            @Override
            public int wordsPerPage() {
                return 150;
            }

            @Override
            public String toString() {
                return super.toString() + " with pictures!";
            }
        }

        public static class MusicAlbum implements Media {
            private int numTracks;

            public MusicAlbum(int numTracks) {
                this.numTracks = numTracks;
            }

            @Override
            public int totalTime() {
                return this.numTracks * 4;
            }

            @Override
            public String toString() {
                return "album";
            }
        }
    }
}