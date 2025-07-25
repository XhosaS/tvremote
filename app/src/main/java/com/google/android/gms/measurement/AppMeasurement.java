package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import defpackage.kkk;
import defpackage.kqs;
import defpackage.kqt;
import defpackage.kqu;
import defpackage.lbk;
import defpackage.lcp;
import defpackage.lep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {
    private static volatile AppMeasurement a;
    private final kqu b;

    /* compiled from: PG */
    public class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(Bundle bundle) {
            kkk.k(bundle);
            this.mAppId = (String) lcp.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) lcp.a(bundle, "origin", String.class, null);
            this.mName = (String) lcp.a(bundle, "name", String.class, null);
            this.mValue = lcp.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) lcp.a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) lcp.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) lcp.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) lcp.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) lcp.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) lcp.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) lcp.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) lcp.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) lcp.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) lcp.a(bundle, "active", Boolean.class, false)).booleanValue();
            this.mCreationTimestamp = ((Long) lcp.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) lcp.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(lep lepVar) {
        this.b = new kqt(lepVar);
    }

    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        lep lepVar;
        if (a == null) {
            synchronized (AppMeasurement.class) {
                if (a == null) {
                    try {
                        lepVar = (lep) Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    } catch (ClassNotFoundException | Exception unused) {
                        lepVar = null;
                    }
                    if (lepVar != null) {
                        a = new AppMeasurement(lepVar);
                    } else {
                        a = new AppMeasurement(lbk.i(context, new InitializationParams(0L, 0L, true, null, null), null));
                    }
                }
            }
        }
        return a;
    }

    public void beginAdUnitExposure(String str) {
        this.b.i(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.b.j(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.b.k(str);
    }

    public long generateEventId() {
        return this.b.b();
    }

    public String getAppInstanceId() {
        return this.b.c();
    }

    public List getConditionalUserProperties(String str, String str2) {
        List listG = this.b.g(str, str2);
        ArrayList arrayList = new ArrayList(listG == null ? 0 : listG.size());
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.b.d();
    }

    public String getCurrentScreenName() {
        return this.b.e();
    }

    public String getGmpAppId() {
        return this.b.f();
    }

    public int getMaxUserProperties(String str) {
        return this.b.a(str);
    }

    protected Map getUserProperties(String str, String str2, boolean z) {
        return this.b.h(str, str2, z);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.b.l(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        kkk.k(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            lcp.b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        kqu kquVar = this.b;
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        kquVar.m(bundle);
    }

    public AppMeasurement(lbk lbkVar) {
        this.b = new kqs(lbkVar);
    }
}
