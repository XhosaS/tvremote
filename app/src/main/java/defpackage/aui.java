package defpackage;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.PreferenceScreen;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aui extends atz {
    public aui() {
        auj.a(this);
    }

    @Override // defpackage.bq
    public View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray typedArrayObtainStyledAttributes = dZ().obtainStyledAttributes(null, bji.h, R.attr.preferenceFragmentCompatStyle, 0);
        this.f = typedArrayObtainStyledAttributes.getResourceId(0, this.f);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(dZ());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        RecyclerView recyclerViewM = m(layoutInflaterCloneInContext, viewGroup2);
        if (recyclerViewM == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.c = recyclerViewM;
        bip bipVar = ((bit) this).a;
        recyclerViewM.aw(bipVar);
        if (drawable != null) {
            bipVar.b = drawable.getIntrinsicHeight();
        } else {
            bipVar.b = 0;
        }
        bipVar.a = drawable;
        bit bitVar = bipVar.d;
        bitVar.c.Q();
        if (dimensionPixelSize != -1) {
            bipVar.b = dimensionPixelSize;
            bitVar.c.Q();
        }
        bipVar.c = z;
        if (this.c.getParent() == null) {
            viewGroup2.addView(this.c);
        }
        this.ah.post(this.ai);
        View viewInflate2 = LayoutInflater.from(viewInflate.getContext()).inflate(R.layout.leanback_preference_fragment, viewGroup, false);
        ViewGroup viewGroup3 = (ViewGroup) viewInflate2.findViewById(R.id.main_frame);
        if (viewInflate != null) {
            viewGroup3.addView(viewInflate);
        }
        return viewInflate2;
    }

    @Override // defpackage.bq
    public void aa(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreenAB;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreenAB = aB()) != null) {
            preferenceScreenAB.u(bundle2);
        }
        if (this.d) {
            aC();
        }
        this.e = true;
        CharSequence charSequence = aB().q;
        View view2 = this.R;
        TextView textView = view2 == null ? null : (TextView) view2.findViewById(R.id.decor_title);
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
