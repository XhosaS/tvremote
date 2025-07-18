package android.support.v7.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import defpackage.crl;
import defpackage.cus;
import defpackage.cut;
import defpackage.cuu;
import defpackage.cww;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class AppCompatReceiveContentHelper {
    private static final String LOG_TAG = "ReceiveContent";

    /* compiled from: PG */
    final class OnDropApi24Impl {
        private OnDropApi24Impl() {
        }

        static boolean onDropForTextView(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                ClipData clipData = dragEvent.getClipData();
                cww.c(textView, crl.h(Build.VERSION.SDK_INT >= 31 ? new cus(clipData, 3) : new cuu(clipData, 3)));
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        static boolean onDropForView(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            ClipData clipData = dragEvent.getClipData();
            cww.c(view, crl.h(Build.VERSION.SDK_INT >= 31 ? new cus(clipData, 3) : new cuu(clipData, 3)));
            return true;
        }
    }

    private AppCompatReceiveContentHelper() {
    }

    static boolean maybeHandleDragEventViaPerformReceiveContent(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && cww.w(view) != null) {
            Activity activityTryGetActivity = tryGetActivity(view);
            if (activityTryGetActivity == null) {
                Objects.toString(view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                if (view instanceof TextView) {
                    OnDropApi24Impl.onDropForTextView(dragEvent, (TextView) view, activityTryGetActivity);
                } else {
                    OnDropApi24Impl.onDropForView(dragEvent, view, activityTryGetActivity);
                }
                return true;
            }
        }
        return false;
    }

    static boolean maybeHandleMenuActionViaPerformReceiveContent(TextView textView, int i) {
        if (Build.VERSION.SDK_INT < 31 && cww.w(textView) != null) {
            if (i != 16908322) {
                if (i == 16908337) {
                    i = 16908337;
                }
            }
            ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                cut cusVar = Build.VERSION.SDK_INT >= 31 ? new cus(primaryClip, 1) : new cuu(primaryClip, 1);
                cusVar.c(i != 16908322 ? 1 : 0);
                cww.c(textView, crl.h(cusVar));
            }
            return true;
        }
        return false;
    }

    static Activity tryGetActivity(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
