package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class agw extends agz {
    public agw(Class cls) {
        super(R.id.tag_state_description, cls, 64, 30);
    }

    @Override // defpackage.agz
    public final /* synthetic */ Object a(View view) {
        return ahh.b(view);
    }

    @Override // defpackage.agz
    public final /* synthetic */ void b(View view, Object obj) {
        ahh.c(view, (CharSequence) obj);
    }

    @Override // defpackage.agz
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
