package defpackage;

import android.support.v7.widget.RecyclerView;
import android.text.format.Formatter;
import com.google.android.apps.play.movies.mobile.usecase.downloads.RatioBar;
import com.google.android.videos.R;
import java.io.File;
import java.util.IdentityHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mnr extends ifc implements iea {
    private final idf c;
    public final idt b = new idt(null);
    private final Map e = new IdentityHashMap();
    public mnl a = mnl.a;
    private final Object d = new Object();

    public mnr(idf idfVar) {
        this.c = idfVar;
    }

    @Override // defpackage.ieh
    public final Object a() {
        return this.d;
    }

    @Override // defpackage.ifc
    public final int b(Object obj) {
        return 1;
    }

    @Override // defpackage.ifc
    public final int c(Object obj, int i) {
        return R.layout.manage_downloads_storage_header;
    }

    @Override // defpackage.ifc
    public final long d(Object obj, int i) {
        return ((Long) this.c.b(this.d)).longValue();
    }

    @Override // defpackage.ifc
    public final void e(Object obj, int i, RecyclerView.ViewHolder viewHolder) {
        Map map = this.e;
        mnq mnqVar = (mnq) map.get(viewHolder);
        if (mnqVar == null) {
            mnqVar = new mnq(this, viewHolder.itemView);
            map.put(viewHolder, mnqVar);
        }
        long totalSpace = 0;
        long usableSpace = 0;
        for (File file : kfw.P(mnqVar.itemView.getContext())) {
            if (file != null) {
                usableSpace += file.getUsableSpace();
                totalSpace += file.getTotalSpace();
            }
        }
        mnl mnlVar = mnqVar.c.a;
        long j = mnlVar.c;
        long j2 = mnlVar.b;
        long j3 = (totalSpace - usableSpace) - j;
        float f = totalSpace;
        RatioBar ratioBar = mnqVar.a;
        long j4 = (totalSpace - j2) - j3;
        ratioBar.a = new float[]{j3 / f, j / f, (j2 - j) / f, j4 / f};
        ratioBar.invalidate();
        mnqVar.b.setText(mnqVar.itemView.getResources().getString(R.string.storage_space_free, Formatter.formatShortFileSize(mnqVar.itemView.getContext(), j4)));
    }

    @Override // defpackage.ids
    public final void ea(iej iejVar) {
        this.b.ea(iejVar);
    }

    @Override // defpackage.ids
    public final void ee(iej iejVar) {
        this.b.ee(iejVar);
    }
}
