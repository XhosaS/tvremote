package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class myj {
    public static int a(int i, aew aewVar, CharSequence charSequence, eny enyVar) {
        int i2 = i - 1;
        if (i2 == 3) {
            return (enyVar == eny.RTL) == aewVar.a(charSequence, charSequence.length()) ? 2 : 3;
        }
        if (i2 == 4) {
            return (enyVar == eny.RTL) == aewVar.a(charSequence, charSequence.length()) ? 3 : 2;
        }
        if (i2 == 5) {
            return aewVar.a(charSequence, charSequence.length()) ? 3 : 2;
        }
        if (i2 != 6) {
            return 4;
        }
        return aewVar.a(charSequence, charSequence.length()) ? 2 : 3;
    }

    public static int b(ndo ndoVar) {
        int iE = ndoVar.E() - 1;
        if (iE == 1) {
            return 6;
        }
        if (iE != 2) {
            return iE != 3 ? 4 : 3;
        }
        return 7;
    }
}
