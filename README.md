# oauth2-provider-resource
Open sourcing my oauth2 server and resource as an example. The responsibility of the oauth2 provider is to issue, verify, refresh and revoke tokens from client apps on behalf of a protected resource/api.

In this example, the resource and provider are completely isolated and use different databases. The reason for this design is so that if the provider is compromised, then the resource is still protected and vice versa. The provider database stores user credentials only: username, password, and roles.

--more details to come
