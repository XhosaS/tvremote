package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bxr implements bmi {
    public static final bxr a = new bxr();
    public static Boolean b;

    private bxr() {
    }

    @Override // defpackage.bmi
    public final void a(boolean z) {
        b = Boolean.valueOf(z);
    }

    @Override // defpackage.bmi
    public final boolean d() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        bty.a("canFocus is read before it is written");
        throw new yfs();
    }

    @Override // defpackage.bmi
    public final /* synthetic */ void b(yjv yjvVar) {
    }

    @Override // defpackage.bmi
    public final /* synthetic */ void c(yjv yjvVar) {
    }
}
