package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mws {
    static final acwt a;
    public final Context b;
    public final DisplayMetrics c;

    static {
        acwt acwtVar = acwt.a;
        acwq acwqVar = new acwq();
        if ((acwqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acwqVar.y();
        }
        acwt acwtVar2 = (acwt) acwqVar.b;
        acwtVar2.b |= 1;
        acwtVar2.c = false;
        a = (acwt) acwqVar.v();
    }

    public mws(Context context) {
        this.b = context;
        this.c = context.getResources().getDisplayMetrics();
    }

    public final acwt a(bxz bxzVar, final View view) {
        Optional optionalOf;
        if (bxzVar == null) {
            return a;
        }
        acwt acwtVar = acwt.a;
        acwq acwqVar = new acwq();
        if ((acwqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acwqVar.y();
        }
        acwt acwtVar2 = (acwt) acwqVar.b;
        acwtVar2.b |= 1;
        acwtVar2.c = true;
        bxx bxxVar = bxzVar.c;
        int i = 3;
        int i2 = bxxVar == bxx.a ? 2 : bxxVar == bxx.b ? 3 : 1;
        if ((acwqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acwqVar.y();
        }
        acwt acwtVar3 = (acwt) acwqVar.b;
        acwtVar3.d = i2 - 1;
        acwtVar3.b |= 2;
        bxy bxyVar = bxzVar.b;
        if (!agvy.c(bxyVar, bxy.b) && (!agvy.c(bxyVar, bxy.a) || !agvy.c(bxxVar, bxx.b))) {
            i = 2;
        } else if (bxzVar.a() != bxw.a) {
            i = bxzVar.a() == bxw.b ? 4 : 1;
        }
        if ((acwqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acwqVar.y();
        }
        acwt acwtVar4 = (acwt) acwqVar.b;
        acwtVar4.e = i - 1;
        acwtVar4.b |= 4;
        Rect rectA = bxzVar.a.a();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        Rect rect = new Rect(i3, i4, view.getWidth() + i3, view.getHeight() + i4);
        Rect rect2 = new Rect(rectA);
        if (rect2.intersect(rect)) {
            rect2.offset(-i3, -i4);
            optionalOf = Optional.of(rect2);
        } else {
            optionalOf = Optional.empty();
        }
        Optional map = optionalOf.map(new Function() { // from class: mwr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Rect rect3 = (Rect) obj;
                mws mwsVar = this.a;
                boolean zA = oha.a(mwsVar.b.getResources());
                View view2 = view;
                int width = zA ? view2.getWidth() - rect3.right : rect3.left;
                int width2 = zA ? view2.getWidth() - rect3.left : rect3.right;
                acvi acviVar = acvi.a;
                acvh acvhVar = new acvh();
                acvk acvkVar = acvk.a;
                acvj acvjVar = new acvj();
                DisplayMetrics displayMetrics = mwsVar.c;
                float fA = mxi.a(displayMetrics, rect3.top);
                if ((acvjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acvjVar.y();
                }
                acvk acvkVar2 = (acvk) acvjVar.b;
                acvkVar2.b |= 1;
                acvkVar2.c = fA;
                acvk acvkVar3 = (acvk) acvjVar.v();
                if ((acvhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acvhVar.y();
                }
                acvi acviVar2 = (acvi) acvhVar.b;
                acvkVar3.getClass();
                acviVar2.c = acvkVar3;
                acviVar2.b |= 1;
                acvj acvjVar2 = new acvj();
                float fA2 = mxi.a(displayMetrics, width);
                if ((acvjVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acvjVar2.y();
                }
                acvk acvkVar4 = (acvk) acvjVar2.b;
                acvkVar4.b |= 1;
                acvkVar4.c = fA2;
                acvk acvkVar5 = (acvk) acvjVar2.v();
                if ((acvhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acvhVar.y();
                }
                acvi acviVar3 = (acvi) acvhVar.b;
                acvkVar5.getClass();
                acviVar3.g = acvkVar5;
                acviVar3.b |= 16;
                acvj acvjVar3 = new acvj();
                float fA3 = mxi.a(displayMetrics, rect3.bottom);
                if ((acvjVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acvjVar3.y();
                }
                acvk acvkVar6 = (acvk) acvjVar3.b;
                acvkVar6.b |= 1;
                acvkVar6.c = fA3;
                acvk acvkVar7 = (acvk) acvjVar3.v();
                if ((acvhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acvhVar.y();
                }
                acvi acviVar4 = (acvi) acvhVar.b;
                acvkVar7.getClass();
                acviVar4.e = acvkVar7;
                acviVar4.b |= 4;
                acvj acvjVar4 = new acvj();
                float fA4 = mxi.a(displayMetrics, width2);
                if ((acvjVar4.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acvjVar4.y();
                }
                acvk acvkVar8 = (acvk) acvjVar4.b;
                acvkVar8.b |= 1;
                acvkVar8.c = fA4;
                acvk acvkVar9 = (acvk) acvjVar4.v();
                if ((acvhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acvhVar.y();
                }
                acvi acviVar5 = (acvi) acvhVar.b;
                acvkVar9.getClass();
                acviVar5.h = acvkVar9;
                acviVar5.b |= 32;
                return (acvi) acvhVar.v();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (map.isPresent()) {
            acvi acviVar = (acvi) map.get();
            if ((acwqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acwqVar.y();
            }
            acwt acwtVar5 = (acwt) acwqVar.b;
            acwtVar5.f = acviVar;
            acwtVar5.b |= 8;
        }
        return (acwt) acwqVar.v();
    }
}
