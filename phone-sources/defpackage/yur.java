package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yur extends yvk<yup<?>> {
    public long a = -1;
    public yih b;

    @Override // defpackage.yvk
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        yup yupVar = (yup) obj;
        if (this.a >= 0) {
            return false;
        }
        long j = yupVar.b;
        if (j < yupVar.c) {
            yupVar.c = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.yvk
    public final /* bridge */ /* synthetic */ yih[] b(Object obj) {
        boolean z = yoy.a;
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((yup) obj).j(j);
    }
}
