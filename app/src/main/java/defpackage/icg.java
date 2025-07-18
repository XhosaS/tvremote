package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class icg {
    public static final ice a;
    public static final Map b;
    public static final icg c;
    public static final icg d;
    public static final icg e;
    public static final icg f;
    public static final icg g;
    public static final icg h;
    public static final icg i;
    public static final icg j;
    public static final icg k;
    public static final icg l;
    public static final icg m;
    public static final icg n;
    public static final icg o;
    public static final icg p;
    public static final icg q;
    public static final icg r;
    public static final icg s;
    public static final icg t;
    public static final icg u;
    public static final /* synthetic */ agtv v;
    private static final /* synthetic */ icg[] y;
    public final String w;
    public final int x;

    static {
        icg icgVar = new icg("HOTWORD_ACCEPTED", 0, "setting.mirror.hotword_accepted", 1);
        c = icgVar;
        icg icgVar2 = new icg("HOTWORD_PERMISSION_STATE_SET", 1, "setting.mirror.hotword_permission_state_set", 1);
        d = icgVar2;
        icg icgVar3 = new icg("INTENT_LOGGER_ENABLED", 2, "setting.mirror.intent_logger_enabled", 1);
        e = icgVar3;
        icg icgVar4 = new icg("IS_OPERATOR_DEVICE", 3, "setting.mirror.is_operator_device", 1);
        f = icgVar4;
        icg icgVar5 = new icg("SAFE_SEARCH_ENABLED", 4, "setting.mirror.safe_search_enabled", 1);
        g = icgVar5;
        icg icgVar6 = new icg("TEMPERATURE_UNIT", 5, "setting.mirror.temperature_unit", 2);
        h = icgVar6;
        icg icgVar7 = new icg("ANDROID_ID", 6, "setting.mirror.android_id", 3);
        i = icgVar7;
        icg icgVar8 = new icg("NETFLIX_DSC_DENIED_COUNT", 7, "setting.mirror.netflix_dsc_denied_count", 3);
        j = icgVar8;
        icg icgVar9 = new icg("ACCOUNTS_ACKED_3P_DISCLOSURE", 8, "setting.mirror.accounts_acked_3p_disclosure", 4);
        k = icgVar9;
        icg icgVar10 = new icg("ASSISTANT_DISABLED_ACCOUNTS", 9, "setting.mirror.assistant_disabled_accounts", 4);
        l = icgVar10;
        icg icgVar11 = new icg("ASSISTANT_ENABLED_ACCOUNTS", 10, "setting.mirror.assistant_enabled_accounts", 4);
        m = icgVar11;
        icg icgVar12 = new icg("DSC_DENIED_ACCOUNTS", 11, "setting.mirror.dsc_denied_accounts", 4);
        n = icgVar12;
        icg icgVar13 = new icg("DSC_DENIED_IN_OOBE_ACCOUNTS", 12, "setting.mirror.dsc_denied_in_OOBE_accounts", 4);
        o = icgVar13;
        icg icgVar14 = new icg("DSC_GRANTED_ACCOUNTS", 13, "setting.mirror.dsc_granted_accounts", 4);
        p = icgVar14;
        icg icgVar15 = new icg("UDC_PERMISSION_DENIED", 14, "setting.mirror.udc_permission_denied", 4);
        q = icgVar15;
        icg icgVar16 = new icg("UDC_PERMISSION_GRANTED", 15, "setting.mirror.udc_permission_granted", 4);
        r = icgVar16;
        icg icgVar17 = new icg("UDC_PERMISSION_UNKNOWN", 16, "setting.mirror.udc_permission_unknown", 4);
        s = icgVar17;
        icg icgVar18 = new icg("VOICE_INPUT_DISABLED_ACCOUNTS", 17, "setting.mirror.voice_input_disabled_accounts", 4);
        t = icgVar18;
        icg icgVar19 = new icg("VOICE_INPUT_ENABLED_ACCOUNTS", 18, "setting.mirror.voice_input_enabled_accounts", 4);
        u = icgVar19;
        icg[] icgVarArr = {icgVar, icgVar2, icgVar3, icgVar4, icgVar5, icgVar6, icgVar7, icgVar8, icgVar9, icgVar10, icgVar11, icgVar12, icgVar13, icgVar14, icgVar15, icgVar16, icgVar17, icgVar18, icgVar19};
        y = icgVarArr;
        v = agtw.a(icgVarArr);
        a = new ice();
        icg[] icgVarArrValues = values();
        ArrayList arrayList = new ArrayList(icgVarArrValues.length);
        for (icg icgVar20 : icgVarArrValues) {
            arrayList.add(new agpi(icgVar20.w, icgVar20));
        }
        b = agrj.f(arrayList);
    }

    private icg(String str, int i2, String str2, int i3) {
        this.w = str2;
        this.x = i3;
    }

    public static icg[] values() {
        return (icg[]) y.clone();
    }
}
