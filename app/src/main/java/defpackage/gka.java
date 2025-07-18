package defpackage;

import com.google.assistant.sdk.libassistant.ConversationStateListener;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gka extends agtu implements agvb {
    final /* synthetic */ ConversationStateListener.Resolution a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gka(ConversationStateListener.Resolution resolution, int i, int i2, agsw agswVar) {
        super(2, agswVar);
        this.a = resolution;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gka) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.d;
        yfg yfgVar = yfg.a;
        yff yffVar = new yff();
        int iA = yad.a(this.a.toString());
        if ((yffVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yffVar.y();
        }
        yfg yfgVar2 = (yfg) yffVar.b;
        yfgVar2.e = iA - 1;
        yfgVar2.b |= 4;
        if ((yffVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yffVar.y();
        }
        int i = this.b;
        yfg yfgVar3 = (yfg) yffVar.b;
        yfgVar3.b |= 1;
        yfgVar3.c = i;
        if ((yffVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yffVar.y();
        }
        int i2 = this.c;
        yfg yfgVar4 = (yfg) yffVar.b;
        yfgVar4.b |= 2;
        yfgVar4.d = i2;
        abxd abxdVarV = yffVar.v();
        abxdVarV.getClass();
        yca ycaVar = xzyVar.a;
        yfg yfgVar5 = (yfg) abxdVarV;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = yfgVar5;
        ycbVar.c = 47;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gka gkaVar = new gka(this.a, this.b, this.c, agswVar);
        gkaVar.d = obj;
        return gkaVar;
    }
}
