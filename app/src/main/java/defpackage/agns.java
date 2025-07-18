package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agns implements aidf {
    public static final agns a;
    private static final /* synthetic */ agns[] b;

    static {
        agns agnsVar = new agns();
        a = agnsVar;
        b = new agns[]{agnsVar};
    }

    private agns() {
    }

    public static void a() {
        agoh.e(new aggt("Subscription already set!"));
    }

    public static boolean b(long j) {
        if (j > 0) {
            return true;
        }
        agoh.e(new IllegalArgumentException(a.l(j, "n > 0 required but it was ")));
        return false;
    }

    public static boolean d(aidf aidfVar, aidf aidfVar2) {
        if (aidfVar2 == null) {
            agoh.e(new NullPointerException("next is null"));
            return false;
        }
        if (aidfVar == null) {
            return true;
        }
        aidfVar2.fh();
        a();
        return false;
    }

    public static agns[] values() {
        return (agns[]) b.clone();
    }

    @Override // defpackage.aidf
    public final void fh() {
    }

    @Override // defpackage.aidf
    public final void fi(long j) {
    }
}
