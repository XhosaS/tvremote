package defpackage;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.text.TextUtils;
import com.google.android.katniss.R;
import com.google.assistant.sdk.libassistant.AssistantEventListener;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import java.util.Date;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbj extends AssistantEventListener {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/app/timeevent/AlarmTimerEventListener");
    private final Context b;
    private final lzb c;
    private final ghr d;
    private final jca e;

    public fbj(Context context, lzb lzbVar, ghr ghrVar, jca jcaVar) {
        this.b = context;
        this.c = lzbVar;
        this.d = ghrVar;
        this.e = jcaVar;
    }

    @Override // com.google.assistant.sdk.libassistant.AssistantEventListener
    public final void onAlarmEvent(byte[] bArr) throws abxv {
        try {
            abxd abxdVarH = abxd.h(xbt.a, bArr, 0, bArr.length, ExtensionRegistryLite.getGeneratedRegistry());
            if (abxdVarH != null) {
                abxd abxdVar = null;
                byte bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue();
                if (bByteValue != 1) {
                    if (bByteValue != 0) {
                        boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                        if (true == zL) {
                            abxdVar = abxdVarH;
                        }
                        abxdVarH.cM(2, abxdVar);
                        if (zL) {
                        }
                    }
                    throw new abzz().a();
                }
            }
            for (xbr xbrVar : ((xbt) abxdVarH).b) {
                int iA = xbp.a(xbrVar.b);
                if (iA != 0 && iA == 3) {
                    fbl.b(true, this.e);
                    lzb lzbVar = this.c;
                    Context context = this.b;
                    Instant instantOfEpochMilli = Instant.ofEpochMilli(xbrVar.c);
                    Locale locale = Locale.getDefault();
                    LocalTime localTime = instantOfEpochMilli.atZone(ZoneId.systemDefault()).toLocalTime();
                    Date date = abie.a;
                    localTime.getClass();
                    locale.getClass();
                    DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("jm", locale);
                    long nanoOfDay = localTime.toNanoOfDay() / 1000000;
                    Calendar calendar = instanceForSkeleton.getCalendar();
                    if (al$$ExternalSyntheticApiModelOutline1.m60m((Object) calendar)) {
                        al$$ExternalSyntheticApiModelOutline1.m((Object) calendar).setGregorianChange(abie.a);
                    }
                    calendar.setTimeInMillis(nanoOfDay);
                    instanceForSkeleton.setTimeZone(TimeZone.GMT_ZONE);
                    lzbVar.w(context.getString(R.string.alarm_firing, instanceForSkeleton.format(calendar)));
                }
            }
            this.d.af();
        } catch (abxv e) {
            ((zdv) ((zdv) ((zdv) a.d()).p(e)).q("com/google/android/apps/tvsearch/app/timeevent/AlarmTimerEventListener", "onAlarmEvent", '7', "AlarmTimerEventListener.java")).u("Failed to parse alarm params.");
        }
    }

    @Override // com.google.assistant.sdk.libassistant.AssistantEventListener
    public final void onTimerEvent(byte[] bArr) throws abxv {
        try {
            abxd abxdVarH = abxd.h(xes.a, bArr, 0, bArr.length, ExtensionRegistryLite.getGeneratedRegistry());
            if (abxdVarH != null) {
                abxd abxdVar = null;
                byte bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue();
                if (bByteValue != 1) {
                    if (bByteValue != 0) {
                        boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                        if (true == zL) {
                            abxdVar = abxdVarH;
                        }
                        abxdVarH.cM(2, abxdVar);
                        if (zL) {
                        }
                    }
                    throw new abzz().a();
                }
            }
            for (xeq xeqVar : ((xes) abxdVarH).b) {
                int iA = xep.a(xeqVar.b);
                if (iA != 0 && iA == 4) {
                    fbl.b(true, this.e);
                    lzb lzbVar = this.c;
                    Context context = this.b;
                    String str = xeqVar.d;
                    lzbVar.w(TextUtils.isEmpty(str) ? context.getString(R.string.timer_firing, fbl.a(context, Duration.ofMillis(xeqVar.c).toDays(), R.string.day) + fbl.a(context, r1.toHoursPart(), R.string.hour) + fbl.a(context, r1.toMinutesPart(), R.string.minute) + fbl.a(context, r1.toSecondsPart(), R.string.second)) : context.getString(R.string.labeled_timer_firing, str));
                }
            }
            this.d.af();
        } catch (abxv e) {
            ((zdv) ((zdv) ((zdv) a.d()).p(e)).q("com/google/android/apps/tvsearch/app/timeevent/AlarmTimerEventListener", "onTimerEvent", 'K', "AlarmTimerEventListener.java")).u("Failed to parse timer params.");
        }
    }
}
