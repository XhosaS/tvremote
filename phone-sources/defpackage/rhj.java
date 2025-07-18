package defpackage;

import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rhj implements quv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rhj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.quv
    public final String a(String str) {
        return this.b != 0 ? ((qvr) this.a).itemView.getContext().getString(R.string.og_use_account_a11y_no_period, str) : ((rhp) this.a).getContext().getString(R.string.og_signed_in_as_account, str);
    }
}
