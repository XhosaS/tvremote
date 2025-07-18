package org.chromium.support_lib_boundary;

import android.content.Context;
import android.webkit.WebView;
import defpackage.a;
import defpackage.al$$ExternalSyntheticApiModelOutline1;
import j$.util.function.Consumer$CC;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface WebViewBuilderBoundaryInterface {

    /* compiled from: PG */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Baseline {
        public static final int DEFAULT = 0;
    }

    /* compiled from: PG */
    public class Config implements Consumer {
        public boolean restrictJavascriptInterface;
        public int baseline = 0;
        final List a = new ArrayList();
        final Map b = new LinkedHashMap();
        final List c = new ArrayList();

        @Override // java.util.function.Consumer
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            accept(al$$ExternalSyntheticApiModelOutline1.m54m(obj));
        }

        public void addJavascriptInterface(Object obj, String str, List list) {
            Map map = this.b;
            if (map.containsKey(str)) {
                throw new IllegalArgumentException(a.e(str, "A duplicate JavaScript interface was provided for \"", "\""));
            }
            this.a.add(obj);
            map.put(str, true);
            this.c.add(list);
        }

        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer$CC.$default$andThen(this, consumer);
        }

        public void accept(BiConsumer biConsumer) {
            biConsumer.accept(0, Integer.valueOf(this.baseline));
            biConsumer.accept(2, Boolean.valueOf(this.restrictJavascriptInterface));
            biConsumer.accept(1, new Object[]{this.a, new ArrayList(this.b.keySet()), this.c});
        }
    }

    /* compiled from: PG */
    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConfigField {
        public static final int BASELINE = 0;
        public static final int JAVASCRIPT_INTERFACE = 1;
        public static final int RESTRICT_JAVASCRIPT_INTERFACE = 2;
    }

    WebView build(Context context, Consumer consumer);
}
