package defpackage;

import android.app.Application;
import android.content.Context;
import com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase;
import java.util.HashMap;
import javax.net.ssl.SSLContext;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qar implements xcm {
    private final xcq a;
    private final xcq b;
    private final /* synthetic */ int c;

    public qar(xcq xcqVar, xcq xcqVar2, int i) {
        this.c = i;
        this.a = xcqVar;
        this.b = xcqVar2;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        uht uhtVar;
        boolean z = false;
        switch (this.c) {
            case 0:
                qas qasVar = (qas) this.a.b();
                return new ntp(qasVar);
            case 1:
                return new rbi(new qal(((rgq) this.b).a(), ((mdx) this.a).a(), 0));
            case 2:
                return new qbe((qbr) this.b.b(), (pvg) this.a.b());
            case 3:
                return new qbf((pzq) this.b.b(), (pyd) this.a.b());
            case 4:
                return new qce(((rgq) this.a).a(), (qei) this.b.b());
            case 5:
                return new qhg((SSLContext) this.b.b(), (uhs) this.a.b());
            case 6:
                tst tstVar = (tst) ((xcn) this.b).a;
                uht uhtVar2 = (uht) this.a.b();
                tvn tvnVar = qhu.a;
                uhtVar2.getClass();
                yfo yfoVar = (yfo) tstVar.f();
                if (yfoVar != null && (uhtVar = (uht) yfoVar.b()) != null) {
                    uhtVar2 = uhtVar;
                }
                uhtVar2.getClass();
                return uhtVar2;
            case 7:
                Context contextA = ((rgq) this.a).a();
                qps qpsVar = new qps();
                qei qeiVar = (qei) this.b.b();
                qeiVar.getClass();
                qpsVar.a(contextA);
                if (xff.a.get().c() && qeiVar.j) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                qja qjaVar = (qja) this.a.b();
                ((qib) this.b).a();
                return new ntp(qjaVar);
            case 9:
                return new rbi(((qny) this.b).b(), ((mdx) this.a).a());
            case 10:
                return new rbi(new qal(((rgq) this.b).a(), ((mdx) this.a).a(), 2));
            case 11:
                xcq xcqVar = this.a;
                Context contextA2 = ((rgq) this.b).a();
                yil yilVarA = ((mdx) xcqVar).a();
                gev gevVarD = gez.d(contextA2, GnpRoomDatabase.class, "gnp_fcm_database");
                gevVarD.b(GnpRoomDatabase.z());
                gevVarD.d();
                gevVarD.e(yilVarA);
                GnpRoomDatabase gnpRoomDatabase = (GnpRoomDatabase) gevVarD.a();
                gnpRoomDatabase.getClass();
                return gnpRoomDatabase;
            case 12:
                xcq xcqVar2 = this.a;
                Context contextA3 = ((rgq) this.b).a();
                yil yilVarA2 = ((mdx) xcqVar2).a();
                gev gevVarD2 = gez.d(contextA3, GnpRoomDatabase.class, "gnp_database");
                gevVarD2.b(GnpRoomDatabase.z());
                gevVarD2.d();
                gevVarD2.e(yilVarA2);
                GnpRoomDatabase gnpRoomDatabase2 = (GnpRoomDatabase) gevVarD2.a();
                gnpRoomDatabase2.getClass();
                return gnpRoomDatabase2;
            case 13:
                uhs uhsVar = (uhs) this.a.b();
                aafi aafiVar = (aafi) this.b.b();
                uhsVar.getClass();
                aafiVar.getClass();
                smf smfVar = smf.a;
                HashMap map = new HashMap();
                sik.b(sli.a, map);
                return new unc(uhsVar, aafiVar, smfVar, map);
            case 14:
                return new rbi(((qoe) this.b).a(), ((qib) this.a).a(), null);
            case 15:
                rbi rbiVar = (rbi) this.b.b();
                rbi rbiVarB = ((qoc) this.a).b();
                rbiVar.getClass();
                return new rbi(new qal(rbiVarB, rbiVar, 3));
            case 16:
                xcq xcqVar3 = this.a;
                Context contextA4 = ((rgq) this.b).a();
                uht uhtVar3 = (uht) xcqVar3.b();
                uhtVar3.getClass();
                return new qoj(uhtVar3, new aafi(contextA4, "STREAMZ_GNP_ANDROID"), (Application) contextA4);
            case 17:
                return new aafi(((qny) this.b).b(), ((mdx) this.a).a());
            case 18:
                return new qpn(((rgq) this.a).a(), (qpl) this.b.b());
            case 19:
                return new qsh(((qoe) this.a).a(), (tst) ((xcn) this.b).a);
            default:
                return new qtd(((rgq) this.b).a(), ((qsz) this.a).b());
        }
    }

    public qar(xcq xcqVar, xcq xcqVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = xcqVar;
        this.a = xcqVar2;
    }
}
