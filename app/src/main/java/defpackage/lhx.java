package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: PG */
/* loaded from: classes.dex */
class lhx implements Runnable {
    final /* synthetic */ lih a;

    public lhx(lih lihVar) {
        this.a = lihVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lih lihVar = this.a;
        lihVar.aC().g();
        lihVar.k = new lar(lihVar);
        kug kugVar = new kug(lihVar);
        kugVar.ah();
        lihVar.c = kugVar;
        ktx ktxVarJ = lihVar.j();
        lbb lbbVar = lihVar.a;
        kkk.k(lbbVar);
        ktxVarJ.b = lbbVar;
        lgr lgrVar = new lgr(lihVar);
        lgrVar.ah();
        lihVar.i = lgrVar;
        ktr ktrVar = new ktr(lihVar);
        ktrVar.ah();
        lihVar.f = ktrVar;
        leu leuVar = new leu(lihVar);
        leuVar.ah();
        lihVar.h = leuVar;
        lho lhoVar = new lho(lihVar);
        lhoVar.ah();
        lihVar.e = lhoVar;
        lihVar.d = new lai(lihVar);
        if (lihVar.q != lihVar.r) {
            lihVar.aB().c.c("Not all upload components initialized", Integer.valueOf(lihVar.q), Integer.valueOf(lihVar.r));
        }
        lihVar.m.set(true);
        lihVar.aB().k.a("UploadController is now fully initialized");
        lihVar.aC().g();
        kug kugVar2 = lihVar.c;
        lihVar.ai(kugVar2);
        kugVar2.G();
        kug kugVar3 = lihVar.c;
        lihVar.ai(kugVar3);
        kugVar3.g();
        kugVar3.ag();
        if (kugVar3.P()) {
            kzf kzfVar = kzg.av;
            if (((Long) kzfVar.a(null)).longValue() != 0) {
                SQLiteDatabase sQLiteDatabaseE = kugVar3.e();
                lbk lbkVar = kugVar3.y;
                klk klkVar = lbkVar.B;
                int iDelete = sQLiteDatabaseE.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(kzfVar.a(null))});
                if (iDelete > 0) {
                    lab labVar = lbkVar.f;
                    lbkVar.o(labVar);
                    labVar.k.b("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(iDelete));
                }
            }
        }
        lal lalVar = lihVar.i.d;
        lalVar.a();
        if (lalVar.a == 0) {
            lal lalVar2 = lihVar.i.d;
            kkk.k(lihVar.l);
            lalVar2.b(System.currentTimeMillis());
        }
        lihVar.V();
    }
}
