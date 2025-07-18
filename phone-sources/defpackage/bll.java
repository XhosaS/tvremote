package defpackage;

import android.view.DragEvent;
import android.view.View;
import defpackage.bko;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bll implements View.OnDragListener {
    public final bln a = new bln(null, 3);
    public final it b = new it((byte[]) null);
    public final bkp c = new bzi<bln>() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
        @Override // defpackage.bzi
        public final /* bridge */ /* synthetic */ bko d() {
            return this.a.a;
        }

        @Override // defpackage.bzi
        public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }
    };

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        kw kwVar = new kw(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                bln blnVar = this.a;
                ylb ylbVar = new ylb();
                bga.z(blnVar, new ma(kwVar, blnVar, ylbVar, 2));
                boolean z = ylbVar.a;
                is isVar = new is(this.b);
                while (isVar.hasNext()) {
                    ((blo) isVar.next()).a();
                }
                break;
            case 2:
                this.a.cc(kwVar);
                break;
            case 4:
                this.a.b(kwVar);
                this.b.clear();
                break;
            case 5:
                this.a.c(kwVar);
                break;
            case 6:
                this.a.d(kwVar);
                break;
        }
        return false;
    }
}
