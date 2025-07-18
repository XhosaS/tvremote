package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmh {
    public final tmi a(agow agowVar, tmq tmqVar, Context context) {
        agowVar.getClass();
        context.getClass();
        return b(agowVar, tmqVar, context, null, null);
    }

    public final tmi b(agow agowVar, tmq tmqVar, Context context, addl addlVar, tmd tmdVar) {
        agowVar.getClass();
        context.getClass();
        if (tmdVar != null) {
            String packageName = context.getPackageName();
            packageName.getClass();
            return new tlz(agowVar, tmqVar, packageName, addlVar, null, null, tmdVar, null);
        }
        acji acjiVar = acji.a;
        acjh acjhVar = new acjh();
        if (addlVar != null) {
            if ((acjhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acjhVar.y();
            }
            acji acjiVar2 = (acji) acjhVar.b;
            acjiVar2.c = addlVar.X;
            acjiVar2.b |= 1;
        }
        String packageName2 = context.getPackageName();
        packageName2.getClass();
        if ((acjhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acjhVar.y();
        }
        acji acjiVar3 = (acji) acjhVar.b;
        acjiVar3.b |= 2;
        acjiVar3.d = packageName2;
        return new tmc(agowVar, tmqVar, acjj.a(acjhVar));
    }
}
