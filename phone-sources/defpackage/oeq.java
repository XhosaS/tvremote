package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oeq extends oet {
    final /* synthetic */ Intent a;
    final /* synthetic */ WeakReference b;

    public oeq(Intent intent, WeakReference weakReference) {
        this.a = intent;
        this.b = weakReference;
    }

    @Override // defpackage.oet
    public final void a(GoogleHelp googleHelp) {
        ViewGroup viewGroup;
        Intent intent = this.a;
        intent.putExtra("EXTRA_START_TICK", System.nanoTime());
        Activity activity = (Activity) this.b.get();
        if (activity == null) {
            return;
        }
        googleHelp.z = nvj.b;
        TogglingData togglingData = googleHelp.w;
        if (togglingData != null) {
            String string = activity.getTitle().toString();
            int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
            if (identifier != 0 && (viewGroup = (ViewGroup) activity.findViewById(identifier)) != null) {
                int i = 0;
                while (true) {
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof TextView) {
                        string = ((TextView) childAt).getText().toString();
                        break;
                    }
                    i++;
                }
            }
            togglingData.c = string;
        }
        if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            intent.putExtra("EXTRA_GOOGLE_HELP", googleHelp);
        } else if (intent.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
            oeo oeoVar = (oeo) ocv.u(intent, "EXTRA_IN_PRODUCT_HELP", oeo.CREATOR);
            oeoVar.a = googleHelp;
            Parcel parcelObtain = Parcel.obtain();
            obd.c(oeoVar, parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            intent.putExtra("EXTRA_IN_PRODUCT_HELP", bArrMarshall);
        }
        new ogh(Looper.getMainLooper()).post(new non((Object) activity, (Object) intent, 11, (byte[]) null));
    }
}
