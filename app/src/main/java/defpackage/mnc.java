package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.libraries.elements.interfaces.DirectUpdateExecutor;
import io.grpc.Status;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mnc extends DirectUpdateExecutor {
    public static final /* synthetic */ int a = 0;
    private Handler b;
    private final Map c;
    private final DisplayMetrics d;

    public mnc(Map map, DisplayMetrics displayMetrics) {
        this.c = map;
        this.d = displayMetrics;
    }

    private final void a(final dtl dtlVar, final Object obj) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            dtlVar.a(obj);
            return;
        }
        if (this.b == null) {
            this.b = new Handler(Looper.getMainLooper());
        }
        this.b.post(new Runnable() { // from class: mnb
            @Override // java.lang.Runnable
            public final void run() {
                int i = mnc.a;
                dtlVar.a(obj);
            }
        });
    }

    @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
    public final Status applyChangeAnimatedVectorTypeAnimationProgress(float f) {
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
    public final Status applyChangeStylePropertiesBackgroundColor(long j) {
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
    public final Status applyChangeStylePropertiesOpacity(float f) {
        dtl dtlVar = (dtl) this.c.get(acvm.DYNAMIC_PROP_TYPE_ALPHA);
        if (dtlVar != null) {
            a(dtlVar, Float.valueOf(f));
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
    public final Status applyChangeStylePropertiesRotation(float f) {
        dtl dtlVar = (dtl) this.c.get(acvm.DYNAMIC_PROP_TYPE_ROTATION);
        if (dtlVar != null) {
            a(dtlVar, Float.valueOf(f));
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
    public final Status applyChangeStylePropertiesScale(float f) {
        Map map = this.c;
        dtl dtlVar = (dtl) map.get(acvm.DYNAMIC_PROP_TYPE_SCALE_X);
        if (dtlVar != null) {
            a(dtlVar, Float.valueOf(f));
        }
        dtl dtlVar2 = (dtl) map.get(acvm.DYNAMIC_PROP_TYPE_SCALE_Y);
        if (dtlVar2 != null) {
            a(dtlVar2, Float.valueOf(f));
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
    public final Status applyChangeStylePropertiesScaleX(float f) {
        dtl dtlVar = (dtl) this.c.get(acvm.DYNAMIC_PROP_TYPE_SCALE_X);
        if (dtlVar != null) {
            a(dtlVar, Float.valueOf(f));
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
    public final Status applyChangeStylePropertiesScaleY(float f) {
        dtl dtlVar = (dtl) this.c.get(acvm.DYNAMIC_PROP_TYPE_SCALE_Y);
        if (dtlVar != null) {
            a(dtlVar, Float.valueOf(f));
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
    public final Status applyChangeStylePropertiesTranslation(float f, float f2) {
        Map map = this.c;
        dtl dtlVar = (dtl) map.get(acvm.DYNAMIC_PROP_TYPE_TRANSLATION_X);
        if (dtlVar != null) {
            a(dtlVar, Float.valueOf(TypedValue.applyDimension(1, f, this.d)));
        }
        dtl dtlVar2 = (dtl) map.get(acvm.DYNAMIC_PROP_TYPE_TRANSLATION_Y);
        if (dtlVar2 != null) {
            a(dtlVar2, Float.valueOf(TypedValue.applyDimension(1, f2, this.d)));
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
    public final Status applyChangeStylePropertiesTranslationX(float f) {
        dtl dtlVar = (dtl) this.c.get(acvm.DYNAMIC_PROP_TYPE_TRANSLATION_X);
        if (dtlVar != null) {
            a(dtlVar, Float.valueOf(TypedValue.applyDimension(1, f, this.d)));
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
    public final Status applyChangeStylePropertiesTranslationY(float f) {
        dtl dtlVar = (dtl) this.c.get(acvm.DYNAMIC_PROP_TYPE_TRANSLATION_Y);
        if (dtlVar != null) {
            a(dtlVar, Float.valueOf(TypedValue.applyDimension(1, f, this.d)));
        }
        return Status.OK;
    }
}
