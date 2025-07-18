package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxo extends WindowInsetsAnimation$Callback {
    private final cxj a;
    private List b;
    private ArrayList c;
    private final HashMap d;

    public cxo(cxj cxjVar) {
        super(cxjVar.c);
        this.d = new HashMap();
        this.a = cxjVar;
    }

    private final nxb a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.d;
        nxb nxbVar = (nxb) map.get(windowInsetsAnimation);
        if (nxbVar != null) {
            return nxbVar;
        }
        nxb nxbVar2 = new nxb(windowInsetsAnimation);
        map.put(windowInsetsAnimation, nxbVar2);
        return nxbVar2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.c(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.d(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return this.a.a(cyh.o(windowInsets), this.b).e();
            }
            WindowInsetsAnimation windowInsetsAnimationM36m = agx$$ExternalSyntheticApiModelOutline0.m36m(list.get(size));
            nxb nxbVarA = a(windowInsetsAnimationM36m);
            nxbVarA.r(windowInsetsAnimationM36m.getFraction());
            this.c.add(nxbVarA);
        }
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        cxi cxiVarB = this.a.b(a(windowInsetsAnimation), new cxi(bounds));
        return new WindowInsetsAnimation.Bounds(cxiVarB.a.a(), cxiVarB.b.a());
    }
}
