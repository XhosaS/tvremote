package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eig implements ekh {
    private final Context a;
    private final esl b;
    private final esx c = esx.a;

    public eig(Context context) {
        this.a = context;
        this.b = new esl(context);
    }

    @Override // defpackage.ekh
    public final ekc[] a(Handler handler, fcf fcfVar, els elsVar, eyf eyfVar, etj etjVar) {
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        fbi fbiVar = new fbi(context);
        esl eslVar = this.b;
        fbiVar.c = eslVar;
        esx esxVar = this.c;
        fbiVar.b = esxVar;
        fbiVar.d = 5000L;
        fbiVar.e = handler;
        fbiVar.f = fcfVar;
        fbiVar.g = 50;
        fbiVar.h = -9223372036854775807L;
        arrayList.add(fbiVar.a());
        arrayList.add(new emp(context, eslVar, esxVar, handler, elsVar, new slp(context).a()));
        arrayList.add(new eyg(eyfVar, handler.getLooper()));
        Looper looper = handler.getLooper();
        arrayList.add(new etk(etjVar, looper));
        arrayList.add(new etk(etjVar, looper));
        arrayList.add(new fcl());
        arrayList.add(new esc(new zlj(context)));
        return (ekc[]) arrayList.toArray(new ekc[0]);
    }

    @Override // defpackage.ekh
    public final void b(ekc ekcVar) {
        ekcVar.dk();
    }
}
