package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mnt extends bl implements xce {
    public xcd a;
    public Uri b;
    public irc c;
    private CharSequence d;
    private wpg e;

    @Override // defpackage.xce
    public final xby<Object> androidInjector() {
        xcd xcdVar = this.a;
        if (xcdVar != null) {
            return xcdVar;
        }
        yks.c("androidInjector");
        return null;
    }

    @Override // defpackage.bl, defpackage.bv
    public final void onAttach(Context context) {
        context.getClass();
        wae.x(this);
        super.onAttach(context);
    }

    @Override // defpackage.bl, defpackage.bv
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.d = arguments.getString("service_name");
            this.b = Uri.parse(arguments.getString("action_uri"));
            wpg wpgVar = wpg.a;
            wpgVar.getClass();
            this.e = (wpg) hju.H(arguments, "prompt_message", wpgVar);
        }
    }

    @Override // defpackage.bl
    public final Dialog onCreateDialog(Bundle bundle) {
        CharSequence charSequenceFromHtml;
        wpg wpgVar = this.e;
        if (wpgVar == null || yks.e(wpgVar, wpg.a)) {
            Context context = getContext();
            context.getClass();
            ssn ssnVar = new ssn(context);
            Context context2 = getContext();
            ssnVar.e(context2 != null ? context2.getString(R.string.gtv_services_selection_linked_message, this.d) : null);
            Context context3 = getContext();
            ssnVar.m(context3 != null ? context3.getString(R.string.gtv_services_selection_linked_action_text) : null, new gcu(this, 17, null));
            Context context4 = getContext();
            ssnVar.h(context4 != null ? context4.getString(R.string.cancel) : null, new ixr(12));
            return ssnVar.create();
        }
        Context context5 = getContext();
        context5.getClass();
        ssn ssnVar2 = new ssn(context5);
        wls wlsVar = wpgVar.b;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        if (wlsVar.c) {
            wls wlsVar2 = wpgVar.b;
            if (wlsVar2 == null) {
                wlsVar2 = wls.a;
            }
            charSequenceFromHtml = Html.fromHtml(wlsVar2.b, 0);
            charSequenceFromHtml.getClass();
        } else {
            wls wlsVar3 = wpgVar.b;
            if (wlsVar3 == null) {
                wlsVar3 = wls.a;
            }
            charSequenceFromHtml = wlsVar3.b;
            charSequenceFromHtml.getClass();
        }
        ssnVar2.e(charSequenceFromHtml);
        ssnVar2.m(wpgVar.c, new izm(this, wpgVar, 2));
        Context context6 = getContext();
        ssnVar2.h(context6 != null ? context6.getString(R.string.cancel) : null, new ixr(11));
        return ssnVar2.create();
    }
}
