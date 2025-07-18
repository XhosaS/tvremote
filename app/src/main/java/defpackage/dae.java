package defpackage;

import java.io.FileInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dae implements daf {
    final /* synthetic */ dbk a;
    final /* synthetic */ ddx b;

    public dae(dbk dbkVar, ddx ddxVar) {
        this.a = dbkVar;
        this.b = ddxVar;
    }

    @Override // defpackage.daf
    public final boolean a(czv czvVar) throws Throwable {
        dkq dkqVar;
        ddx ddxVar;
        try {
            FileInputStream fileInputStream = new FileInputStream(this.a.a.rewind().getFileDescriptor());
            ddxVar = this.b;
            dkqVar = new dkq(fileInputStream, ddxVar);
        } catch (Throwable th) {
            th = th;
            dkqVar = null;
        }
        try {
            boolean zE = czvVar.e(dkqVar, ddxVar);
            dkqVar.b();
            this.a.a.rewind();
            return zE;
        } catch (Throwable th2) {
            th = th2;
            if (dkqVar != null) {
                dkqVar.b();
            }
            this.a.a.rewind();
            throw th;
        }
    }
}
