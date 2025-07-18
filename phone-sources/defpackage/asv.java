package defpackage;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.google.android.videos.R;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asv extends fm {
    public yjk a;
    public final ass b;
    private atd c;
    private long d;
    private final View e;
    private final float f;

    public asv(yjk yjkVar, atd atdVar, long j, View view, cmi cmiVar, clx clxVar, UUID uuid, mr mrVar, yow yowVar) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0, 2, null);
        this.a = yjkVar;
        this.c = atdVar;
        this.d = j;
        this.e = view;
        this.f = 8.0f;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        cwn.c(window, false);
        ass assVar = new ass(getContext());
        Objects.toString(uuid);
        assVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:".concat(String.valueOf(uuid)));
        assVar.setClipChildren(false);
        assVar.setElevation(clxVar.cr(8.0f));
        assVar.setOutlineProvider(new ast());
        this.b = assVar;
        setContentView(assVar);
        dwf.f(assVar, dwf.e(view));
        dwf.d(assVar, dwf.c(view));
        gez.w(assVar, gez.v(view));
        a(this.a, this.c, this.d, cmiVar);
        cxe cxeVar = new cxe(window, window.getDecorView());
        cxeVar.i(wv.H(this.d));
        cxeVar.h(wv.H(this.d));
        getOnBackPressedDispatcher().b(this, new asu(yowVar, mrVar, new aoe(this, 9)));
    }

    public final void a(yjk yjkVar, atd atdVar, long j, cmi cmiVar) {
        this.a = yjkVar;
        this.c = atdVar;
        this.d = j;
        int i = atdVar.a;
        boolean zC = a.C(this.e);
        Window window = getWindow();
        window.getClass();
        int i2 = 1;
        window.setFlags(true != zC ? -8193 : 8192, 8192);
        int iOrdinal = cmiVar.ordinal();
        if (iOrdinal == 0) {
            i2 = 0;
        } else if (iOrdinal != 1) {
            throw new yfu();
        }
        this.b.setLayoutDirection(i2);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.a.a();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
