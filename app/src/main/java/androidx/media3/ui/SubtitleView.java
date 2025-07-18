package androidx.media3.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.bfy;
import defpackage.bfz;
import defpackage.bgh;
import defpackage.bgi;
import defpackage.bgr;
import defpackage.bgu;
import defpackage.bgy;
import defpackage.yqx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {
    private List a;
    private bgi b;
    private float c;
    private float d;
    private boolean e;
    private boolean f;
    private int g;
    private bgr h;
    private View i;

    public SubtitleView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a(View view) {
        removeView(this.i);
        View view2 = this.i;
        if (view2 instanceof bgy) {
            ((bgy) view2).a.destroy();
        }
        this.i = view;
        this.h = (bgr) view;
        addView(view);
    }

    private final void b() {
        List arrayList;
        bgr bgrVar = this.h;
        if (this.e && this.f) {
            arrayList = this.a;
        } else {
            arrayList = new ArrayList(this.a.size());
            for (int i = 0; i < this.a.size(); i++) {
                bfy bfyVar = new bfy((bfz) this.a.get(i));
                if (!this.e) {
                    CharSequence charSequence = bfyVar.a;
                    if (charSequence instanceof Spanned) {
                        if (!(charSequence instanceof Spannable)) {
                            bfyVar.a = SpannableString.valueOf(charSequence);
                        }
                        CharSequence charSequence2 = bfyVar.a;
                        charSequence2.getClass();
                        bgu.b((Spannable) charSequence2, new yqx() { // from class: bgs
                            @Override // defpackage.yqx
                            public final boolean a(Object obj) {
                                return !(obj instanceof bgb);
                            }
                        });
                    }
                    bgu.a(bfyVar);
                } else if (!this.f) {
                    bgu.a(bfyVar);
                }
                arrayList.add(bfyVar.a());
            }
        }
        bgrVar.a(arrayList, this.b, this.c, this.d);
    }

    public void setBottomPaddingFraction(float f) {
        this.d = f;
        b();
    }

    public void setFractionalTextSize(float f) {
        this.c = f;
        b();
    }

    public void setViewType(int i) {
        if (this.g == i) {
            return;
        }
        if (i == 1) {
            a(new bgh(getContext()));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            a(new bgy(getContext()));
        }
        this.g = i;
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = Collections.EMPTY_LIST;
        this.b = bgi.a;
        this.c = 0.0533f;
        this.d = 0.08f;
        this.e = true;
        this.f = true;
        bgh bghVar = new bgh(context);
        this.h = bghVar;
        this.i = bghVar;
        addView(bghVar);
        this.g = 1;
    }
}
