package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yqk implements yqi {
    public static final yqk a;
    private static final /* synthetic */ yqk[] b;

    static {
        yqk yqkVar = new yqk();
        a = yqkVar;
        b = new yqk[]{yqkVar};
    }

    private yqk() {
    }

    public static yqk[] values() {
        return (yqk[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Functions.identity()";
    }

    @Override // defpackage.yqi
    public final Object apply(Object obj) {
        return obj;
    }
}
