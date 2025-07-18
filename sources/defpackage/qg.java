package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qg extends qj {
    public qg(Class cls) {
        super(R.id.tag_state_description, cls, 64, 30);
    }

    @Override // defpackage.qj
    public final /* synthetic */ Object a(View view) {
        return qr.b(view);
    }

    @Override // defpackage.qj
    public final /* synthetic */ void b(View view, Object obj) {
        qr.c(view, (CharSequence) obj);
    }

    @Override // defpackage.qj
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
