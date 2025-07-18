package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.play.movies.common.view.tagging.TagsView;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mtd extends FrameLayout implements msx {
    public final TagsView a;
    public final List b;
    public final mcy c;
    public final ieg d;
    public final iea e;
    final RecyclerView f;
    public final RecyclerView g;
    public final san h;
    public final rzy i;
    public boolean j;
    public kri k;
    public lwx l;
    public gag m;

    public mtd(mcy mcyVar, iea ieaVar, ldv ldvVar, san sanVar, Context context, rzy rzyVar) {
        super(context, null, 0);
        this.c = mcyVar;
        this.e = ieaVar;
        this.h = sanVar;
        this.i = rzyVar;
        this.d = ldvVar.a();
        LayoutInflater.from(context).inflate(R.layout.knowledge_overlay_content, this);
        setVisibility(8);
        this.a = (TagsView) findViewById(R.id.tags_view);
        this.f = (RecyclerView) findViewById(R.id.info_cards_view);
        RecyclerView recyclerView = new RecyclerView(context);
        this.g = recyclerView;
        recyclerView.setBackgroundResource(R.color.gray_900);
        this.b = new ArrayList();
        setClipChildren(false);
        setClipToPadding(false);
        setMeasureAllChildren(true);
        e();
    }

    @Override // defpackage.mgf
    public final void a(boolean z) {
        int i = true != z ? 8 : 0;
        this.a.setVisibility(i);
        setVisibility(i);
    }

    @Override // defpackage.mgf
    public final boolean b() {
        return getVisibility() == 0;
    }

    @Override // defpackage.mgf
    public final void c() {
        throw null;
    }

    @Override // defpackage.mrh
    public final boolean d() {
        f();
        return false;
    }

    public final void e() {
        f();
        this.f.setVisibility(8);
        setVisibility(8);
        this.b.clear();
        this.a.a();
    }

    public final void f() {
        if (this.j) {
            removeView(this.g);
            g(false);
        }
        kri kriVar = this.k;
        if (kriVar != null) {
            kriVar.b();
            this.k = null;
        }
        this.j = false;
    }

    public final void g(boolean z) {
        this.a.setVisibility(true != z ? 0 : 8);
        if (!z) {
            this.j = false;
        }
        this.m.m(z);
    }

    @Override // defpackage.mga
    public final mfz generateLayoutParams() {
        return new mfz(-1, -1, false);
    }

    @Override // defpackage.mga
    public final boolean isAvodOverlay() {
        return false;
    }

    @Override // defpackage.mga
    public final View getView() {
        return this;
    }

    @Override // defpackage.mga
    public final /* synthetic */ void hideFeedbackText(boolean z) {
    }
}
