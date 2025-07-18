package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class the implements thg {
    public final ahbt a;
    public final thq b;
    public final tht c;
    public final tgm d;
    public final tfu e;
    public final tgt f;
    public final kab g;
    public final thl h;
    private final Context i;

    public the(Context context, ahbt ahbtVar, thq thqVar, tgu tguVar, tht thtVar, Set set, thm thmVar, thh thhVar, tgm tgmVar, tfu tfuVar) {
        this.i = context;
        this.a = ahbtVar;
        this.b = thqVar;
        this.c = thtVar;
        this.d = tgmVar;
        this.e = tfuVar;
        this.f = tguVar.a(tgmVar.a().a());
        this.g = mhm.b(context, new aidl());
        this.h = thmVar.a(set, thhVar.a(tfuVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.thg
    public final zyd a(rru rruVar, yyk yykVar) {
        rruVar.getClass();
        yykVar.getClass();
        zmx zmxVar = zmx.a;
        zmw zmwVar = new zmw();
        ahpb ahpbVarE = rruVar.e();
        if ((zmwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zmwVar.y();
        }
        zmx zmxVar2 = (zmx) zmwVar.b;
        zmxVar2.h = ahpbVarE;
        zmxVar2.d |= 32768;
        zdm zdmVarListIterator = yykVar.listIterator(0);
        zdmVarListIterator.getClass();
        while (zdmVarListIterator.hasNext()) {
            ror rorVar = (ror) zdmVarListIterator.next();
            zmwVar.f(rorVar.a(), rorVar.b());
        }
        return ahkr.c(this.a, 0, new thd(this, zmwVar, rruVar, null), 3);
    }
}
