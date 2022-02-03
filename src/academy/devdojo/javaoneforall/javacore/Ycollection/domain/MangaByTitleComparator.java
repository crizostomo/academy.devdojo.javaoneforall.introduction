package academy.devdojo.javaoneforall.javacore.Ycollection.domain;

import java.util.Comparator;

class MangaByTitleComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getTitle().compareTo(manga2.getTitle());
    }
}
