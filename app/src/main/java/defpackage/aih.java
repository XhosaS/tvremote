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
class aih extends WindowInsetsAnimation$Callback {
    private final aib a;
    private List b;
    private ArrayList c;
    private final HashMap d;

    public aih(aib aibVar) {
        super(0);
        this.d = new HashMap();
        this.a = aibVar;
    }

    private final aik a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.d;
        aik aikVar = (aik) map.get(windowInsetsAnimation);
        if (aikVar != null) {
            return aikVar;
        }
        aik aikVar2 = new aik(windowInsetsAnimation);
        map.put(windowInsetsAnimation, aikVar2);
        return aikVar2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.a(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.b(a(windowInsetsAnimation));
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
                aib aibVar = this.a;
                ajc ajcVarG = ajc.g(windowInsets, null);
                aibVar.c(ajcVarG, this.b);
                return ajcVarG.e();
            }
            WindowInsetsAnimation windowInsetsAnimationM158m = ms$$ExternalSyntheticApiModelOutline0.m158m(list.get(size));
            aik aikVarA = a(windowInsetsAnimationM158m);
            aikVarA.a.k(windowInsetsAnimationM158m.getFraction());
            this.c.add(aikVarA);
        }
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        aik aikVarA = a(windowInsetsAnimation);
        aia aiaVar = new aia(bounds);
        this.a.d(aikVarA, aiaVar);
        return new WindowInsetsAnimation.Bounds(aiaVar.a.a(), aiaVar.b.a());
    }
}
