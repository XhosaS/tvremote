package defpackage;

import android.view.ViewParent;
import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dut {
    public final List a = new ArrayList(2);
    private final ComponentTree b;

    public dut(ComponentTree componentTree) {
        this.b = componentTree;
    }

    public final void a(dvz dvzVar) {
        ComponentTree componentTree = this.b;
        if (componentTree.o) {
            for (ViewParent parent = dvzVar.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof bxb) {
                    bxb bxbVar = (bxb) parent;
                    dus dusVar = new dus(componentTree, bxbVar);
                    try {
                        throw null;
                    } catch (ConcurrentModificationException unused) {
                        duq duqVar = new duq();
                        int[] iArr = ahj.a;
                        bxbVar.postOnAnimation(duqVar);
                        this.a.add(dusVar);
                    }
                }
            }
        }
    }
}
