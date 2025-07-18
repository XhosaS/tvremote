package defpackage;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bf implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, yjk] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                cz.b(this.a, 4);
                break;
            case 1:
                Object obj = this.a;
                Iterator it = ((bh) obj).a.iterator();
                while (it.hasNext()) {
                    ((bi) it.next()).a.f((dm) obj);
                }
                break;
            case 2:
                yjk yjkVar = (yjk) ((ylf) this.a).a;
                if (yjkVar != null) {
                    yjkVar.a();
                    break;
                }
                break;
            case 3:
                bl blVar = (bl) this.a;
                blVar.mOnDismissListener.onDismiss(blVar.mDialog);
                break;
            case 4:
                ((bv) this.a).m79lambda$performCreateView$0$androidsupportv4appFragment();
                break;
            case 5:
                ((bv) this.a).startPostponedEnterTransition();
                break;
            case 6:
                ((bv) this.a).callStartTransitionListener(false);
                break;
            case 7:
                dp dpVar = (dp) this.a;
                if (!dpVar.b.isEmpty()) {
                    dpVar.f();
                    break;
                }
                break;
            case 8:
                ArrayList arrayList = ((cr) this.a).j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((cn) arrayList.get(i)).a();
                }
                break;
            case 9:
                ((cr) this.a).ak(true);
                break;
            case 10:
                ((fl) this.a).invalidateMenu();
                break;
            case 11:
                fl.onBackPressedDispatcher_delegate$lambda$13$lambda$10((fl) this.a);
                break;
            case 12:
                fj fjVar = (fj) this.a;
                Runnable runnable = fjVar.a;
                if (runnable != null) {
                    runnable.run();
                    fjVar.a = null;
                    break;
                }
                break;
            case 13:
                super/*android.app.Dialog*/.onBackPressed();
                break;
            case 14:
                ((hy) this.a).a.o().b();
                break;
            case 15:
                ((hy) this.a).a.o().d();
                break;
            case 16:
                ((hy) this.a).a.u = false;
                break;
            case 17:
                Object obj2 = this.a;
                Context context = ((bv) obj2).getContext();
                if (context == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    break;
                } else {
                    ie ieVar = (ie) obj2;
                    ieVar.c.j(1);
                    ieVar.c.i(context.getString(R.string.fingerprint_dialog_touch_sensor));
                    break;
                }
            case 18:
                this.a.a();
                break;
            case 19:
                aqf aqfVar = (aqf) this.a;
                aqk aqkVar = aqfVar.b;
                if (aqkVar != null) {
                    aqkVar.setState(aqf.a);
                }
                aqfVar.d = null;
                break;
            default:
                Handler handler = bka.a;
                this.a.a();
                break;
        }
    }

    public bf(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
