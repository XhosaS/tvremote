package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qjo extends yiz implements yjz {
    int a;
    Object b;
    int c;
    final /* synthetic */ qjl d;
    final /* synthetic */ qjp e;
    final /* synthetic */ qen f;
    final /* synthetic */ Bundle g;
    final /* synthetic */ Long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjo(qjl qjlVar, qjp qjpVar, qen qenVar, Bundle bundle, Long l, yih yihVar) {
        super(2, yihVar);
        this.d = qjlVar;
        this.e = qjpVar;
        this.f = qenVar;
        this.g = bundle;
        this.h = l;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qjo) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new qjo(this.d, this.e, this.f, this.g, this.h, yihVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        String strP;
        byte[] bArrMarshall;
        gps gpsVarG;
        int i;
        yio yioVar = yio.a;
        if (this.c != 0) {
            i = this.a;
            strP = this.b;
            try {
                ybn.f(obj);
                strP = strP;
            } catch (Exception e) {
                e = e;
                ((tvk) qjp.a.g()).E("Failed to schedule a job for package [%s] with ID: %s, type: %s", this.e.b.getApplicationContext().getPackageName(), strP, new Integer(i));
                return new qdj(e, 24);
            }
        } else {
            ybn.f(obj);
            qjl qjlVar = this.d;
            qen qenVar = this.f;
            int iA = qjlVar.a();
            strP = osk.P(qenVar, iA);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            gli.D("com.google.android.libraries.notifications.platform.JOB_KEY", qjlVar.e(), linkedHashMap);
            gli.D("com.google.android.libraries.notifications.platform.JOB_ID", strP, linkedHashMap);
            Bundle bundle = this.g;
            bundle.getClass();
            if (bundle.isEmpty()) {
                bArrMarshall = null;
            } else {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.getClass();
                bundle.writeToParcel(parcelObtain, 0);
                bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
            }
            if (bArrMarshall != null) {
                gli.C("com.google.android.libraries.notifications.platform.WORKER_PARAMS", bArrMarshall, linkedHashMap);
            }
            gos gosVar = new gos();
            gosVar.c(qjlVar.i() + (-1) != 1 ? 2 : 1);
            gou gouVarA = gosVar.a();
            try {
                gox goxVarY = gli.y(linkedHashMap);
                qjp qjpVar = this.e;
                Context context = qjpVar.b;
                qjpVar.d.e(context.getPackageName(), true);
                qjl qjlVar2 = this.d;
                if (qjlVar2.f()) {
                    Long l = this.h;
                    gpv gpvVar = new gpv(qjpVar.c, qjlVar2.b(), TimeUnit.MILLISECONDS);
                    gpvVar.e(goxVarY);
                    gpvVar.c(gouVarA);
                    osk.Q(gpvVar, qjlVar2, l);
                    gpsVarG = fki.aV(context).f(strP, 3, gpvVar.f());
                } else {
                    Long l2 = this.h;
                    gpo gpoVar = new gpo(qjpVar.c);
                    gpoVar.e(goxVarY);
                    gpoVar.c(gouVarA);
                    osk.Q(gpoVar, qjlVar2, l2);
                    gpsVarG = fki.aV(context).g(strP, 1, gpoVar.f());
                }
                try {
                    uhp uhpVar = ((gpt) gpsVarG).c;
                    this.b = strP;
                    this.a = iA;
                    this.c = 1;
                    if (wae.U(uhpVar, this) == yioVar) {
                        return yioVar;
                    }
                    i = iA;
                    strP = strP;
                } catch (Exception e2) {
                    e = e2;
                    i = iA;
                    ((tvk) qjp.a.g()).E("Failed to schedule a job for package [%s] with ID: %s, type: %s", this.e.b.getApplicationContext().getPackageName(), strP, new Integer(i));
                    return new qdj(e, 24);
                }
            } catch (Exception e3) {
                qjp qjpVar2 = this.e;
                qjpVar2.d.e(qjpVar2.b.getPackageName(), false);
                return new qdj(e3, 20);
            }
        }
        qjp.a.l().E("Successfully scheduled a job for package [%s], with ID: %s, type: %s", this.e.b.getApplicationContext().getPackageName(), strP, new Integer(i));
        return new qdn(ygi.a);
    }
}
