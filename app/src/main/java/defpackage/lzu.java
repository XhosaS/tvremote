package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzu {
    public static final lzu a;
    public static final lzu b;
    public static final lzu c;
    private static final /* synthetic */ lzu[] d;

    static {
        lzu lzuVar = new lzu("NOT_LOADED", 0);
        a = lzuVar;
        lzu lzuVar2 = new lzu("LOADED_FROM_APK", 1);
        b = lzuVar2;
        lzu lzuVar3 = new lzu("LOADED_FROM_SPLIT", 2);
        c = lzuVar3;
        lzu[] lzuVarArr = {lzuVar, lzuVar2, lzuVar3};
        d = lzuVarArr;
        agtw.a(lzuVarArr);
    }

    private lzu(String str, int i) {
    }

    public static lzu[] values() {
        return (lzu[]) d.clone();
    }
}
