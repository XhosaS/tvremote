package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class eiw implements Runnable {
    final /* synthetic */ dvz a;

    public eiw(dvz dvzVar) {
        this.a = dvzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dvd dvdVar;
        ComponentTree componentTree = this.a.m;
        if (componentTree == null || (dvdVar = componentTree.B) == null) {
            return;
        }
        List list = dvdVar.h;
        int size = list.size();
        for (int i = 0; i < size; i++) {
        }
    }
}
