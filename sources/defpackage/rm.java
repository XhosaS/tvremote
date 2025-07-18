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
public final class rm extends WindowInsetsAnimation$Callback {
    private final rg a;
    private List b;
    private ArrayList c;
    private final HashMap d;

    public rm(rg rgVar) {
        super(0);
        this.d = new HashMap();
        this.a = rgVar;
    }

    private final apl a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.d;
        apl aplVar = (apl) map.get(windowInsetsAnimation);
        if (aplVar != null) {
            return aplVar;
        }
        apl aplVar2 = new apl(windowInsetsAnimation);
        map.put(windowInsetsAnimation, aplVar2);
        return aplVar2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.b(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.c(a(windowInsetsAnimation));
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
                rg rgVar = this.a;
                sf sfVarN = sf.n(windowInsets);
                rgVar.a(sfVarN, this.b);
                return sfVarN.e();
            }
            WindowInsetsAnimation windowInsetsAnimationM55m = pd$$ExternalSyntheticApiModelOutline3.m55m(list.get(size));
            apl aplVarA = a(windowInsetsAnimationM55m);
            aplVarA.h(windowInsetsAnimationM55m.getFraction());
            this.c.add(aplVarA);
        }
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        apl aplVarA = a(windowInsetsAnimation);
        rf rfVar = new rf(bounds);
        this.a.d(aplVarA, rfVar);
        return new WindowInsetsAnimation.Bounds(rfVar.a.a(), rfVar.b.a());
    }
}
