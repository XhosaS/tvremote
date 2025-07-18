package defpackage;

import android.content.Context;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmm {
    public static final zer a = aawy.b;
    public final tmi b;
    private final yqt c;
    private final yqt d;
    private final Context e;

    public tmm(tmi tmiVar, yqt yqtVar, yqt yqtVar2, Context context) {
        tmiVar.getClass();
        context.getClass();
        this.c = yqtVar;
        this.d = yqtVar2;
        this.e = context;
        acji acjiVar = acji.a;
        acjh acjhVar = new acjh();
        b(acjhVar);
        abxd abxdVarV = acjhVar.v();
        abxdVarV.getClass();
        this.b = tmiVar.b((acji) abxdVarV);
    }

    public final tml a(Level level) {
        level.getClass();
        acjl acjlVar = acjl.a;
        acjk acjkVar = new acjk();
        acji acjiVar = acji.a;
        acjh acjhVar = new acjh();
        b(acjhVar);
        return new tml(this, level, acjkVar, acjhVar);
    }

    public final void b(acjh acjhVar) {
        addl addlVar = (addl) this.c.f();
        if (addlVar != null) {
            if ((acjhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acjhVar.y();
            }
            acji acjiVar = (acji) acjhVar.b;
            acji acjiVar2 = acji.a;
            acjiVar.c = addlVar.X;
            acjiVar.b |= 1;
        }
        yqt yqtVar = this.d;
        tmd tmdVar = (tmd) yqtVar.f();
        Integer num = null;
        Integer numValueOf = tmdVar != null ? Integer.valueOf(tmdVar.a) : null;
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            if ((acjhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acjhVar.y();
            }
            acji acjiVar3 = (acji) acjhVar.b;
            acji acjiVar4 = acji.a;
            acjiVar3.b |= 8;
            acjiVar3.f = iIntValue;
        }
        tmd tmdVar2 = (tmd) yqtVar.f();
        if (tmdVar2 != null) {
            int i = tmdVar2.b;
            num = 0;
        }
        if (num != null) {
            long jIntValue = num.intValue();
            if ((acjhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acjhVar.y();
            }
            acji acjiVar5 = (acji) acjhVar.b;
            acji acjiVar6 = acji.a;
            acjiVar5.b |= 4;
            acjiVar5.e = jIntValue;
        }
        String packageName = this.e.getPackageName();
        if ((Integer.MIN_VALUE & acjhVar.b.memoizedSerializedSize) == 0) {
            acjhVar.y();
        }
        acji acjiVar7 = (acji) acjhVar.b;
        acji acjiVar8 = acji.a;
        packageName.getClass();
        acjiVar7.b |= 2;
        acjiVar7.d = packageName;
    }
}
