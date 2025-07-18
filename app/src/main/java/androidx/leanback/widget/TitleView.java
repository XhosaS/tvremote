package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.katniss.R;
import defpackage.bal;
import defpackage.bba;
import defpackage.bbb;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TitleView extends FrameLayout {
    private ImageView a;
    private TextView b;
    private SearchOrbView c;
    private final bbb d;

    public TitleView(Context context) {
        this(context, null);
    }

    public Drawable getBadgeDrawable() {
        return this.a.getDrawable();
    }

    public bal getSearchAffordanceColors() {
        return this.c.getOrbColors();
    }

    public View getSearchAffordanceView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.b.getText();
    }

    public bbb getTitleViewAdapter() {
        return this.d;
    }

    public TitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.browseTitleViewStyle);
    }

    public TitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new bba();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.lb_title_view, this);
        this.a = (ImageView) viewInflate.findViewById(R.id.title_badge);
        this.b = (TextView) viewInflate.findViewById(R.id.title_text);
        this.c = (SearchOrbView) viewInflate.findViewById(R.id.title_orb);
        setClipToPadding(false);
        setClipChildren(false);
    }
}
