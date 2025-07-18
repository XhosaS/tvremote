package defpackage;

import java.io.FileInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dab implements dag {
    final /* synthetic */ dbk a;
    final /* synthetic */ ddx b;

    public dab(dbk dbkVar, ddx ddxVar) {
        this.a = dbkVar;
        this.b = ddxVar;
    }

    @Override // defpackage.dag
    public final int a(czv czvVar) throws Throwable {
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
            int iA = czvVar.a(dkqVar, ddxVar);
            dkqVar.b();
            this.a.a.rewind();
            return iA;
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
