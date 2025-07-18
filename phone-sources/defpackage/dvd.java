package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvd {
    public static final dvd a;
    public static final dvd b;
    public static final dvd c;
    public static final dvd d;
    public static final dvd e;
    private static final /* synthetic */ dvd[] f;

    static {
        dvd dvdVar = new dvd("DESTROYED", 0);
        a = dvdVar;
        dvd dvdVar2 = new dvd("INITIALIZED", 1);
        b = dvdVar2;
        dvd dvdVar3 = new dvd("CREATED", 2);
        c = dvdVar3;
        dvd dvdVar4 = new dvd("STARTED", 3);
        d = dvdVar4;
        dvd dvdVar5 = new dvd("RESUMED", 4);
        e = dvdVar5;
        dvd[] dvdVarArr = {dvdVar, dvdVar2, dvdVar3, dvdVar4, dvdVar5};
        f = dvdVarArr;
        wcq.P(dvdVarArr);
    }

    private dvd(String str, int i) {
    }

    public static dvd[] values() {
        return (dvd[]) f.clone();
    }

    public final boolean a(dvd dvdVar) {
        dvdVar.getClass();
        return compareTo(dvdVar) >= 0;
    }
}
