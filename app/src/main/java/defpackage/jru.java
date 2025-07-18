package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.google.android.katniss.R;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jru implements jrs {
    public static final Duration a;
    private static final zdy c = zdy.h("com/google/android/apps/tvsearch/widget/toast/HoverToastImpl");
    private static final Duration d;
    public final WindowManager b;
    private final AccessibilityManager e;
    private final Context f;
    private final LayoutInflater g;
    private final WindowManager.LayoutParams h;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(4L);
        durationOfSeconds.getClass();
        d = durationOfSeconds;
        Duration durationOfSeconds2 = Duration.ofSeconds(7L);
        durationOfSeconds2.getClass();
        a = durationOfSeconds2;
    }

    public jru(AccessibilityManager accessibilityManager, Context context, LayoutInflater layoutInflater, WindowManager windowManager) {
        context.getClass();
        windowManager.getClass();
        this.e = accessibilityManager;
        this.f = context;
        this.g = layoutInflater;
        this.b = windowManager;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -2;
        layoutParams.width = -2;
        layoutParams.format = -3;
        layoutParams.type = 2038;
        layoutParams.setTitle("HoverToast");
        layoutParams.flags = 152;
        layoutParams.gravity = Gravity.getAbsoluteGravity(context.getResources().getInteger(R.integer.config_hoverToastDefaultGravity), context.getResources().getConfiguration().getLayoutDirection());
        if ((layoutParams.gravity & 7) == 7) {
            layoutParams.horizontalWeight = 1.0f;
        }
        if ((layoutParams.gravity & 112) == 112) {
            layoutParams.verticalWeight = 1.0f;
        }
        layoutParams.y = context.getResources().getDimensionPixelSize(R.dimen.hover_toast_y_offset);
        this.h = layoutParams;
    }

    @Override // defpackage.jrs
    public final void a(int i) {
        String string = this.f.getString(i);
        string.getClass();
        d(string, a);
    }

    @Override // defpackage.jrs
    public final void b(CharSequence charSequence) {
        charSequence.getClass();
        d(charSequence, d);
    }

    @Override // defpackage.jrs
    public final void c(int i) {
        String string = this.f.getString(i);
        string.getClass();
        d(string, d);
    }

    public final void d(CharSequence charSequence, Duration duration) {
        final View viewInflate = this.g.inflate(R.layout.transient_notification, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.message)).setText(charSequence);
        try {
            this.b.addView(viewInflate, this.h);
            AccessibilityManager accessibilityManager = this.e;
            if (accessibilityManager.isTouchExplorationEnabled()) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setClassName(accessibilityEventObtain.getClass().getName());
                accessibilityEventObtain.setEventType(32);
                accessibilityEventObtain.setPackageName(this.f.getPackageName());
                accessibilityEventObtain.getText().add(charSequence);
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
            }
            feq.e(new Handler(Looper.getMainLooper()), duration, new Runnable() { // from class: jrt
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b.removeView(viewInflate);
                }
            });
        } catch (WindowManager.BadTokenException e) {
            ((zdv) ((zdv) c.d()).p(e).q("com/google/android/apps/tvsearch/widget/toast/HoverToastImpl", "showToast", 91, "HoverToastImpl.kt")).x("#showToast failed: BadTokenException '%s'", e.getMessage());
        }
    }
}
