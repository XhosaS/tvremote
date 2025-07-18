package defpackage;

import android.view.View;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipItem;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ghz extends agtu implements agvb {
    final /* synthetic */ gkk a;
    final /* synthetic */ View b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghz(gkk gkkVar, View view, agsw agswVar) {
        super(2, agswVar);
        this.a = gkkVar;
        this.b = view;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ghz) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        xzy xzyVar = (xzy) this.c;
        ybc ybcVar = ybc.a;
        yaz yazVar = new yaz();
        ybb ybbVar = ybb.a;
        yba ybaVar = new yba();
        if ((ybaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ybaVar.y();
        }
        gkk gkkVar = this.a;
        ybb ybbVar2 = (ybb) ybaVar.b;
        ybbVar2.b |= 1;
        ybbVar2.e = 0;
        SuggestionChipItem suggestionChipItem = (SuggestionChipItem) gkkVar;
        pan panVar = suggestionChipItem.f;
        int i = ((zot) panVar.b.b).d;
        if ((ybaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ybaVar.y();
        }
        ybb ybbVar3 = (ybb) ybaVar.b;
        ybbVar3.b |= 2;
        ybbVar3.f = i;
        String str = suggestionChipItem.a;
        if ((ybaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ybaVar.y();
        }
        ybb ybbVar4 = (ybb) ybaVar.b;
        ybbVar4.c = 8;
        ybbVar4.d = str;
        if (gkkVar.a() == 2) {
            if ((ybaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ybaVar.y();
            }
            ybb ybbVar5 = (ybb) ybaVar.b;
            ybbVar5.b |= 256;
            ybbVar5.m = true;
        }
        int iA = gkh.a.a(this.b);
        if (iA != 0) {
            if ((ybaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ybaVar.y();
            }
            ybb ybbVar6 = (ybb) ybaVar.b;
            ybbVar6.b |= 4;
            ybbVar6.g = iA;
        }
        ybb ybbVarA = xzv.a(ybaVar);
        if ((yazVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yazVar.y();
        }
        ybc ybcVar2 = (ybc) yazVar.b;
        ybcVar2.c = ybbVarA;
        ybcVar2.b |= 1;
        boolean z = ((zpk) panVar.a.b).d == 67495;
        if ((yazVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yazVar.y();
        }
        ybc ybcVar3 = (ybc) yazVar.b;
        ybcVar3.b |= 4;
        ybcVar3.e = z;
        ybc ybcVarA = xzw.a(yazVar);
        yca ycaVar = xzyVar.a;
        if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ycaVar.y();
        }
        ycb ycbVar = (ycb) ycaVar.b;
        ycb ycbVar2 = ycb.a;
        ycbVar.d = ybcVarA;
        ycbVar.c = 3;
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        ghz ghzVar = new ghz(this.a, this.b, agswVar);
        ghzVar.c = obj;
        return ghzVar;
    }
}
