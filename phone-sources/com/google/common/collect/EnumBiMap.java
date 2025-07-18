package com.google.common.collect;

import defpackage.a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class EnumBiMap<K extends Enum<K>, V extends Enum<V>> extends AbstractBiMap<K, V> {
    private static final long serialVersionUID = 0;
    transient Class<K> keyTypeOrObjectUnderJ2cl;
    transient Class<V> valueTypeOrObjectUnderJ2cl;

    private EnumBiMap(Class<K> cls, Class<V> cls2) {
        super(new EnumMap(cls), new EnumMap(cls2));
        this.keyTypeOrObjectUnderJ2cl = cls;
        this.valueTypeOrObjectUnderJ2cl = cls2;
    }

    public static <K extends Enum<K>, V extends Enum<V>> EnumBiMap<K, V> create(Class<K> cls, Class<V> cls2) {
        return new EnumBiMap<>(cls, cls2);
    }

    static <K extends Enum<K>> Class<K> inferKeyTypeOrObjectUnderJ2cl(Map<K, ?> map) {
        if (map instanceof EnumBiMap) {
            return ((EnumBiMap) map).keyTypeOrObjectUnderJ2cl;
        }
        if (map instanceof EnumHashBiMap) {
            return ((EnumHashBiMap) map).keyTypeOrObjectUnderJ2cl;
        }
        a.H(!map.isEmpty());
        return Platform.getDeclaringClassOrObjectForJ2cl(map.keySet().iterator().next());
    }

    private static <V extends Enum<V>> Class<V> inferValueTypeOrObjectUnderJ2cl(Map<?, V> map) {
        if (map instanceof EnumBiMap) {
            return ((EnumBiMap) map).valueTypeOrObjectUnderJ2cl;
        }
        a.H(!map.isEmpty());
        return Platform.getDeclaringClassOrObjectForJ2cl(map.values().iterator().next());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        object.getClass();
        this.keyTypeOrObjectUnderJ2cl = (Class) object;
        Object object2 = objectInputStream.readObject();
        object2.getClass();
        this.valueTypeOrObjectUnderJ2cl = (Class) object2;
        setDelegates(new EnumMap(this.keyTypeOrObjectUnderJ2cl), new EnumMap(this.valueTypeOrObjectUnderJ2cl));
        Serialization.populateMap(this, objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.keyTypeOrObjectUnderJ2cl);
        objectOutputStream.writeObject(this.valueTypeOrObjectUnderJ2cl);
        Serialization.writeMap(this, objectOutputStream);
    }

    public K checkKey(K k) {
        k.getClass();
        return k;
    }

    public V checkValue(V v) {
        v.getClass();
        return v;
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ Object forcePut(Object obj, Object obj2) {
        return super.forcePut(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ BiMap inverse() {
        return super.inverse();
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public Class<K> keyType() {
        return this.keyTypeOrObjectUnderJ2cl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public /* bridge */ /* synthetic */ Object remove(Object obj) {
        return super.remove(obj);
    }

    public Class<V> valueType() {
        return this.valueTypeOrObjectUnderJ2cl;
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }

    public static <K extends Enum<K>, V extends Enum<V>> EnumBiMap<K, V> create(Map<K, V> map) {
        EnumBiMap<K, V> enumBiMapCreate = create(inferKeyTypeOrObjectUnderJ2cl(map), inferValueTypeOrObjectUnderJ2cl(map));
        enumBiMapCreate.putAll(map);
        return enumBiMapCreate;
    }

    @Override // com.google.common.collect.AbstractBiMap
    public /* bridge */ /* synthetic */ Object checkKey(Object obj) {
        Enum r1 = (Enum) obj;
        checkKey((EnumBiMap<K, V>) r1);
        return r1;
    }

    @Override // com.google.common.collect.AbstractBiMap
    public /* bridge */ /* synthetic */ Object checkValue(Object obj) {
        Enum r1 = (Enum) obj;
        checkValue((EnumBiMap<K, V>) r1);
        return r1;
    }
}
