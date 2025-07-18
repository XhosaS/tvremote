package defpackage;

import java.text.BreakIterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cap extends cao {
    public static cap b;
    public final BreakIterator c;

    public cap(Locale locale) {
        this.c = BreakIterator.getCharacterInstance(locale);
    }

    @Override // defpackage.cat
    public final int[] c(int i) {
        BreakIterator breakIterator;
        int length = a().length();
        if (length > 0 && i < length) {
            if (i < 0) {
                i = 0;
            }
            while (true) {
                BreakIterator breakIterator2 = this.c;
                if (breakIterator2 == null) {
                    yks.c("impl");
                    breakIterator = null;
                } else {
                    breakIterator = breakIterator2;
                }
                if (breakIterator.isBoundary(i)) {
                    if (breakIterator2 == null) {
                        yks.c("impl");
                        breakIterator2 = null;
                    }
                    int iFollowing = breakIterator2.following(i);
                    if (iFollowing != -1) {
                        return b(i, iFollowing);
                    }
                } else {
                    if (breakIterator2 == null) {
                        yks.c("impl");
                        breakIterator2 = null;
                    }
                    i = breakIterator2.following(i);
                    if (i == -1) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.cat
    public final int[] d(int i) {
        BreakIterator breakIterator;
        int length = a().length();
        if (length > 0 && i > 0) {
            if (i > length) {
                i = length;
            }
            while (true) {
                BreakIterator breakIterator2 = this.c;
                if (breakIterator2 == null) {
                    yks.c("impl");
                    breakIterator = null;
                } else {
                    breakIterator = breakIterator2;
                }
                if (breakIterator.isBoundary(i)) {
                    if (breakIterator2 == null) {
                        yks.c("impl");
                        breakIterator2 = null;
                    }
                    int iPreceding = breakIterator2.preceding(i);
                    if (iPreceding != -1) {
                        return b(iPreceding, i);
                    }
                } else {
                    if (breakIterator2 == null) {
                        yks.c("impl");
                        breakIterator2 = null;
                    }
                    i = breakIterator2.preceding(i);
                    if (i == -1) {
                        break;
                    }
                }
            }
        }
        return null;
    }
}
