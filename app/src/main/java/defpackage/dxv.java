package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dxv extends drq {
    private final String a;

    protected dxv(String str) {
        this.a = str;
    }

    @Override // defpackage.drq
    protected final dxh ax(dru druVar, int i) {
        return drq.aa(this) ? new dxh(az(druVar, i)) : new dxh(ay(druVar));
    }

    protected drq ay(dru druVar) {
        return drh.b(druVar).a;
    }

    protected drq az(dru druVar, int i) {
        return drh.b(druVar).a;
    }

    protected drq b() {
        return null;
    }

    @Override // defpackage.drq
    public final String d() {
        drq drqVarB = b();
        if (drqVarB == null) {
            return this.a;
        }
        String str = this.a;
        while (drqVarB instanceof dxv) {
            dxv dxvVar = (dxv) drqVarB;
            if (dxvVar.b() == null) {
                break;
            }
            drqVarB = dxvVar.b();
        }
        return str + "(" + drqVarB.d() + ")";
    }

    @Override // defpackage.drq
    protected final boolean f() {
        return true;
    }
}
