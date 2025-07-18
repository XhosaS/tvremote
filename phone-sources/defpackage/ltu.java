package defpackage;

import android.util.Pair;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ltu implements idf {
    private final /* synthetic */ int a;

    public /* synthetic */ ltu(int i) {
        this.a = i;
    }

    @Override // defpackage.idf
    public final Object b(Object obj) {
        switch (this.a) {
            case 0:
                return kvk.a;
            case 1:
                return nwo.j(obj);
            case 2:
                return nwo.j(obj);
            case 3:
                return kvk.a;
            case 4:
                return nwo.j(obj);
            case 5:
                return new luh(trk.a);
            case 6:
                return nwo.j(obj);
            case 7:
                return kvk.a;
            case 8:
                return nwo.j(obj);
            case 9:
                ieg iegVar = (ieg) obj;
                return iegVar.m() ? ((xag) iegVar.g()).c : ImmutableList.of();
            case 10:
                return ieg.f((List) obj);
            case 11:
                return ((mfq) obj).b;
            case 12:
                mfq mfqVar = (mfq) obj;
                return mfqVar.c() ? ieg.f(mfqVar) : mfqVar.a();
            case 13:
                return ieg.f(((xbf) obj).b);
            case 14:
                return ((lcd) obj).i;
            case 15:
                Collection collection = lbk.a;
                return ksy.h(((law) obj).c);
            case 16:
                return ((kwl) obj).o();
            case 17:
                Collection collection2 = lbk.a;
                return ksy.k(((lce) obj).c);
            case 18:
                int i = lxh.p;
                return ieg.a;
            case 19:
                return ((String) ((maj) obj).e).concat(".stb");
            default:
                return (kwx) ((Pair) obj).first;
        }
    }
}
