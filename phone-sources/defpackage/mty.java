package defpackage;

import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import com.google.android.videos.R;
import java.util.IdentityHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mty extends ifc implements iea {
    private final int a;
    private final idf b;
    private final idt f = new idt(null);
    private final Map d = new IdentityHashMap();
    private boolean e = true;
    private final Object c = new Object();

    public mty(int i, idf idfVar) {
        this.b = idfVar;
        this.a = i;
        i(false);
    }

    @Override // defpackage.ieh
    public final Object a() {
        return this.c;
    }

    @Override // defpackage.ifc
    public final int b(Object obj) {
        return this.e ? 1 : 0;
    }

    @Override // defpackage.ifc
    public final int c(Object obj, int i) {
        return R.layout.no_content;
    }

    @Override // defpackage.ifc
    public final long d(Object obj, int i) {
        return ((Long) this.b.b(this.c)).longValue();
    }

    @Override // defpackage.ifc
    public final void e(Object obj, int i, RecyclerView.ViewHolder viewHolder) {
        Map map = this.d;
        Object mtxVar = (RecyclerView.ViewHolder) map.get(viewHolder);
        if (mtxVar == null) {
            mtxVar = new mtx(viewHolder.itemView);
            map.put(viewHolder, mtxVar);
        }
        mtx mtxVar2 = (mtx) mtxVar;
        mtxVar2.a.setText(R.string.instructions_no_offline_content);
        ((ImageView) mtxVar2.c).setImageResource(R.drawable.ic_on_device_empty_112dp);
        mtxVar2.b.setPadding(0, this.a, 0, 0);
    }

    @Override // defpackage.ids
    public final void ea(iej iejVar) {
        this.f.ea(iejVar);
    }

    @Override // defpackage.ids
    public final void ee(iej iejVar) {
        this.f.ee(iejVar);
    }

    public final void i(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        this.f.eb();
    }
}
