package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbv extends dba {
    private final boolean d;

    public dbv(int i, int i2, boolean z, bda bdaVar) {
        super(i, i2, bdaVar);
        this.d = z;
    }

    @Override // defpackage.dba, defpackage.dbx
    public final dab j() {
        boolean z = this.d;
        int i = this.a;
        int i2 = this.b;
        bda bdaVar = this.c;
        return !z ? dal.h(i, i2, ((dbw) bdaVar.b).a()) : dal.g(i, i2, bdaVar.e());
    }
}
